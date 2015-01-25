package com.rht.rht2.entities.metadata;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mysema.codegen.CodeWriter;
import com.mysema.codegen.model.ClassType;
import com.mysema.codegen.model.Parameter;
import com.mysema.codegen.model.Type;
import com.mysema.codegen.model.TypeCategory;
import com.mysema.codegen.model.Types;
import com.mysema.query.codegen.BeanSerializer;
import com.mysema.query.codegen.EntityType;
import com.mysema.query.codegen.Property;
import com.mysema.query.codegen.SerializerConfig;
import com.mysema.util.BeanUtils;

public class VsBeanSerializer extends BeanSerializer {

private final boolean propertyAnnotations;
    
    private final String javadocSuffix;

    public VsBeanSerializer() {
        this(true, " is a Querydsl bean type");
    }

    public VsBeanSerializer(String javadocSuffix) {
        this(true, javadocSuffix);
    }
    
    public VsBeanSerializer(boolean propertyAnnotations) {
        this(propertyAnnotations, " is a Querydsl bean type");
    }

    public VsBeanSerializer(boolean propertyAnnotations, String javadocSuffix) {
        this.propertyAnnotations = propertyAnnotations;
        this.javadocSuffix = javadocSuffix;
    }

    @Override
    public void serialize(EntityType model, SerializerConfig serializerConfig, CodeWriter writer) throws IOException {
        String simpleName = model.getSimpleName();

        // package
        if (!model.getPackageName().isEmpty()){
            writer.packageDecl(model.getPackageName());
        }

        // imports
        Set<String> importedClasses = getAnnotationTypes(model);
        if (model.hasLists()){
            importedClasses.add(List.class.getName());
        }
        if (model.hasMaps()){
            importedClasses.add(Map.class.getName());
        }
        importedClasses.add(Serializable.class.getName());
        
        writer.importClasses(importedClasses.toArray(new String[importedClasses.size()]));

        // javadoc
        writer.javadoc(simpleName + javadocSuffix);

        // header
        for (Annotation annotation : model.getAnnotations()){
            writer.annotation(annotation);
        }
        
        Type serializable = new ClassType(TypeCategory.SIMPLE, Serializable.class);
        
        writer.beginClass(model, null, serializable);

        bodyStart(model, writer);
        
        // fields
        for (Property property : model.getProperties()){
            if (propertyAnnotations){
                for (Annotation annotation : property.getAnnotations()){
                    writer.annotation(annotation);
                }    
            }            
            writer.privateField(property.getType(), property.getEscapedName());
        }

        // accessors
        for (Property property : model.getProperties()){
            String propertyName = property.getEscapedName();
            // getter
            writer.beginPublicMethod(property.getType(), "get"+BeanUtils.capitalize(propertyName));
            writer.line("return ", propertyName, ";");
            writer.end();
            // setter
            Parameter parameter = new Parameter(propertyName, property.getType());
            writer.beginPublicMethod(Types.VOID, "set"+BeanUtils.capitalize(propertyName), parameter);
            writer.line("this.", propertyName, " = ", propertyName, ";");
            writer.end();
        }

        bodyEnd(model, writer);
        
        writer.end();
    }

    protected void bodyStart(EntityType model, CodeWriter writer) throws IOException {
        // template method        
    }

    protected void bodyEnd(EntityType model, CodeWriter writer) throws IOException {
        // template method        
    }

    private Set<String> getAnnotationTypes(EntityType model) {
        Set<String> imports = new HashSet<String>();
        for (Annotation annotation : model.getAnnotations()){
            imports.add(annotation.annotationType().getName());
        }
        if (propertyAnnotations){
            for (Property property : model.getProperties()){
                for (Annotation annotation : property.getAnnotations()){
                    imports.add(annotation.annotationType().getName());
                }
            }    
        }        
        return imports;
    }
	
}
