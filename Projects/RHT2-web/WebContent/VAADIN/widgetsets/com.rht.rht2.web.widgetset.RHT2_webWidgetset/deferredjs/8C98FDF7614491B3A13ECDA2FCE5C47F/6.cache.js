$wnd.com_rht_rht2_web_widgetset_RHT2_webWidgetset.runAsyncCallback6("function $load_6(this$static){\n  $setSuperClass(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, Lcom_vaadin_shared_AbstractComponentState_2_classLit);\n  $setClass(this$static.val$store, 'com.vaadin.ui.ColorPickerArea', Lcom_vaadin_client_ui_colorpicker_ColorPickerAreaConnector_2_classLit);\n  $setConstructor(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, new ConnectorBundleLoaderImpl$6$1$1(this$static));\n  $setConstructor(this$static.val$store, Lcom_vaadin_client_ui_colorpicker_ColorPickerAreaConnector_2_classLit, new ConnectorBundleLoaderImpl$6$1$2(this$static));\n  $setReturnType(this$static.val$store, Lcom_vaadin_client_ui_colorpicker_ColorPickerAreaConnector_2_classLit, 'getState', new Type(Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit));\n  $setReturnType(this$static.val$store, Lcom_vaadin_client_ui_colorpicker_ColorPickerAreaConnector_2_classLit, 'getWidget', new Type(Lcom_vaadin_client_ui_VColorPickerArea_2_classLit));\n  $setInvoker(this$static.val$store, Lcom_vaadin_client_ui_VColorPickerArea_2_classLit, 'setOpen', new ConnectorBundleLoaderImpl$6$1$3(this$static));\n  $setInvoker(this$static.val$store, Lcom_vaadin_client_ui_VColorPickerArea_2_classLit, 'setColor', new ConnectorBundleLoaderImpl$6$1$4(this$static));\n  $loadJsBundle_4(this$static.val$store);\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'color', new Type(Ljava_lang_String_2_classLit));\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'htmlContentAllowed', new Type(Ljava_lang_Boolean_2_classLit));\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'showDefaultCaption', new Type(Ljava_lang_Boolean_2_classLit));\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'popupVisible', new Type(Ljava_lang_Boolean_2_classLit));\n  $setDelegateToWidget(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'color', 'setColor');\n  $setDelegateToWidget(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'popupVisible', 'setOpen');\n}\n\nfunction $loadJsBundle_4(store){\n  $loadNativeJs_4(store);\n}\n\nfunction $loadNativeJs_4(store){\n  var data_0 = {setter:function(bean, value_0){\n    bean.color_0 = value_0;\n  }\n  , getter:function(bean){\n    return bean.color_0;\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'color', data_0);\n  var data_0 = {setter:function(bean, value_0){\n    bean.htmlContentAllowed = value_0.booleanValue();\n  }\n  , getter:function(bean){\n    return valueOf_50(bean.htmlContentAllowed);\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'htmlContentAllowed', data_0);\n  var data_0 = {setter:function(bean, value_0){\n    bean.showDefaultCaption = value_0.booleanValue();\n  }\n  , getter:function(bean){\n    return valueOf_50(bean.showDefaultCaption);\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'showDefaultCaption', data_0);\n  var data_0 = {setter:function(bean, value_0){\n    bean.popupVisible = value_0.booleanValue();\n  }\n  , getter:function(bean){\n    return valueOf_50(bean.popupVisible);\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerState_2_classLit, 'popupVisible', data_0);\n}\n\ndefineClass(1002, 1, $intern_102);\n_.onSuccess_1 = function onSuccess_7(){\n  $load_6(this);\n  $setLoaded_0(get_24(), $getName_4(this.this$1));\n}\n;\nfunction $$init_1020(){\n}\n\nfunction ConnectorBundleLoaderImpl$6$1$1(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1020();\n}\n\ndefineClass(722, 1, $intern_123, ConnectorBundleLoaderImpl$6$1$1);\n_.invoke_0 = function invoke_199(target, params){\n  return new ColorPickerState;\n}\n;\nfunction $$init_1021(){\n}\n\nfunction ConnectorBundleLoaderImpl$6$1$2(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1021();\n}\n\ndefineClass(1198, 1, $intern_123, ConnectorBundleLoaderImpl$6$1$2);\n_.invoke_0 = function invoke_200(target, params){\n  return new ColorPickerAreaConnector;\n}\n;\nfunction $$init_1022(){\n}\n\nfunction ConnectorBundleLoaderImpl$6$1$3(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1022();\n}\n\ndefineClass(1425, 1, $intern_123, ConnectorBundleLoaderImpl$6$1$3);\n_.invoke_0 = function invoke_201(target, params){\n  $setOpen_0(dynamicCast(target, 122), $booleanValue(dynamicCast(params[0], 21)));\n  return null;\n}\n;\nfunction $$init_1023(){\n}\n\nfunction ConnectorBundleLoaderImpl$6$1$4(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1023();\n}\n\ndefineClass(1350, 1, $intern_123, ConnectorBundleLoaderImpl$6$1$4);\n_.invoke_0 = function invoke_202(target, params){\n  $setColor_1(dynamicCast(target, 122), dynamicCast(params[0], 2));\n  return null;\n}\n;\nfunction $$init_1108(this$static){\n}\n\nfunction $addClickHandler_2(this$static, handler){\n  return $addDomHandler(this$static, handler, getType_10());\n}\n\nfunction $isOpen_2(this$static){\n  return this$static.isOpen;\n}\n\nfunction $refreshColor_0(this$static){\n  jsNotEquals(this$static.color_0, null) && $setProperty_0($getStyle($getElement(this$static.area)), 'background', this$static.color_0);\n}\n\nfunction $setColor_1(this$static, color_0){\n  this$static.color_0 = color_0;\n}\n\nfunction $setHTML_5(this$static, html){\n  this$static.caption_0.setHTML(html);\n}\n\nfunction $setOpen_0(this$static, open_0){\n  this$static.isOpen = open_0;\n}\n\nfunction $setText_8(this$static, text_0){\n  this$static.caption_0.setText(text_0);\n}\n\nfunction VColorPickerArea(){\n  $clinit_UIObject();\n  Widget.call(this);\n  $$init_1108(this);\n  $setElement_0(this, createDiv());\n  this.setStyleName('v-colorpicker');\n  this.caption_0 = new HTML;\n  $addStyleName(this.caption_0, 'v-caption');\n  this.caption_0.setWidth('');\n  this.area = new HTML;\n  this.area.setStylePrimaryName($getStylePrimaryName(this) + '-area');\n  $appendChild($getElement(this), $getElement(this.caption_0));\n  $appendChild($getElement(this), $getElement(this.area));\n  $addClickHandler_2(this, this);\n}\n\ndefineClass(122, 9, {1316:1, 256:1, 2388:1, 187:1, 2093:1, 1712:1, 2173:1, 2090:1, 2227:1, 1885:1, 160:1, 9:1, 122:1}, VColorPickerArea);\n_.addClickHandler = function addClickHandler_4(handler){\n  return $addClickHandler_2(this, handler);\n}\n;\n_.getText = function getText_12(){\n  return $getText_1(this.caption_0);\n}\n;\n_.onBrowserEvent = function onBrowserEvent_12(event_0){\n  var type_0;\n  type_0 = eventGetType(event_0);\n  switch (type_0) {\n    case 1:\n      isOrHasChild_3($getElement(this.area), eventGetTarget_2(event_0)) && $onBrowserEvent(this, event_0);\n      break;\n    default:$onBrowserEvent(this, event_0);\n  }\n}\n;\n_.onClick = function onClick_31(event_0){\n  $setOpen_0(this, !this.isOpen);\n}\n;\n_.setHeight = function setHeight_4(height){\n  this.area.setHeight(height);\n}\n;\n_.setStylePrimaryName = function setStylePrimaryName_5(style){\n  $setStylePrimaryName(this, style);\n  this.area.setStylePrimaryName($getStylePrimaryName(this) + '-area');\n}\n;\n_.setWidth = function setWidth_4(width_0){\n  this.area.setWidth(width_0);\n}\n;\n_.color_0 = null;\n_.isOpen = false;\nfunction $$init_1374(this$static){\n  this$static.rpc = dynamicCast(create_14(Lcom_vaadin_shared_ui_colorpicker_ColorPickerServerRpc_2_classLit, this$static), 231);\n}\n\nfunction $getWidget_13(this$static){\n  return dynamicCast($getWidget_2(this$static), 122);\n}\n\nfunction ColorPickerAreaConnector(){\n  AbstractColorPickerConnector.call(this);\n  $$init_1374(this);\n}\n\ndefineClass(573, 1328, $intern_186, ColorPickerAreaConnector);\n_.createWidget = function createWidget_1(){\n  return new VColorPickerArea;\n}\n;\n_.getWidget_0 = function getWidget_17(){\n  return $getWidget_13(this);\n}\n;\n_.onClick = function onClick_48(event_0){\n  this.rpc.openPopup($isOpen_2($getWidget_13(this)));\n}\n;\n_.refreshColor = function refreshColor(){\n  $refreshColor_0($getWidget_13(this));\n}\n;\n_.setCaption_0 = function setCaption_0(caption){\n  $getState_17(this).htmlContentAllowed?$setHTML_5($getWidget_13(this), caption):$setText_8($getWidget_13(this), caption);\n}\n;\nvar Lcom_vaadin_client_ui_colorpicker_ColorPickerAreaConnector_2_classLit = createForClass('com.vaadin.client.ui.colorpicker.', 'ColorPickerAreaConnector', 573, Lcom_vaadin_client_ui_colorpicker_AbstractColorPickerConnector_2_classLit), Lcom_vaadin_client_ui_VColorPickerArea_2_classLit = createForClass('com.vaadin.client.ui.', 'VColorPickerArea', 122, Lcom_google_gwt_user_client_ui_Widget_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$6$1$1_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$6$1$1', 722, Ljava_lang_Object_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$6$1$2_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$6$1$2', 1198, Ljava_lang_Object_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$6$1$3_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$6$1$3', 1425, Ljava_lang_Object_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$6$1$4_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$6$1$4', 1350, Ljava_lang_Object_2_classLit);\n$entry(onLoad)(6);\n\n//# sourceURL=com.rht.rht2.web.widgetset.RHT2_webWidgetset-6.js\n")
