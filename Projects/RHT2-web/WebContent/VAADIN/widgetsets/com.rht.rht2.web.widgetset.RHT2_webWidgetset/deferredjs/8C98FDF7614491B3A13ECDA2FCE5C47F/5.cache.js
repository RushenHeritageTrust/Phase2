$wnd.com_rht_rht2_web_widgetset_RHT2_webWidgetset.runAsyncCallback5("function $clearBackgroundColor(this$static){\n  $clearProperty(this$static, 'backgroundColor');\n}\n\nfunction $getX(this$static){\n  var relativeElem;\n  relativeElem = $getRelativeElement(this$static);\n  if (isNotNull(relativeElem)) {\n    return $getRelativeX(this$static, relativeElem);\n  }\n  return $getClientX_1(this$static);\n}\n\nfunction $setPixelSize(this$static, width_0, height){\n  width_0 >= 0 && this$static.setWidth(width_0 + 'px');\n  height >= 0 && this$static.setHeight(height + 'px');\n}\n\nfunction $$init_446(){\n}\n\nfunction $addMouseUpHandler_0(this$static, handler){\n  return $addDomHandler(this$static, handler, getType_22());\n}\n\nfunction FocusPanel(){\n  SimplePanel_0.call(this, impl_11.createFocusable());\n  $$init_446();\n}\n\ndefineClass(948, $intern_74, {2086:1, 2341:1, 2125:1, 2203:1, 2248:1, 2269:1, 2209:1, 256:1, 208:1, 1983:1, 2250:1, 2118:1, 2274:1, 2268:1, 2230:1, 1953:1, 2408:1, 2128:1, 1940:1, 2231:1, 2259:1, 1932:1, 2222:1, 2292:1, 2235:1, 2132:1, 2007:1, 2326:1, 2079:1, 1868:1, 2220:1, 1901:1, 1928:1, 2388:1, 2093:1, 1712:1, 2204:1, 46:1, 2189:1, 1925:1, 2227:1, 58:1, 2217:1, 1885:1, 147:1, 1081:1, 1934:1, 1904:1, 2270:1, 2182:1, 160:1, 9:1, 98:1});\n_.addClickHandler = function addClickHandler_1(handler){\n  return $addDomHandler(this, handler, getType_10());\n}\n;\n_.addDoubleClickHandler = function addDoubleClickHandler_1(handler){\n  return $addDomHandler(this, handler, getType_12());\n}\n;\n_.addKeyUpHandler = function addKeyUpHandler_0(handler){\n  return $addDomHandler(this, handler, getType_16());\n}\n;\n_.setFocus = function setFocus_2(focused){\n  focused?impl_11.focus_1($getElement(this)):impl_11.blur_0($getElement(this));\n}\n;\n_.setTabIndex = function setTabIndex_2(index_0){\n  $setTabIndex_3($getElement(this), index_0);\n}\n;\ndefineClass(479, 1, $intern_128);\n_.select_3 = function select_6(p0, p1){\n  this.val$handler.invoke(this, $getMethod_0(getType_34(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientServerRpc_2_classLit), 'select'), initValues(_3Ljava_lang_Object_2_classLit, $intern_7, 1, 3, [valueOf_58(p0), valueOf_58(p1)]));\n}\n;\nfunction $load_5(this$static){\n  $setSuperClass(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, Lcom_vaadin_shared_AbstractComponentState_2_classLit);\n  $setClass(this$static.val$store, 'com.vaadin.ui.components.colorpicker.ColorPickerGradient', Lcom_vaadin_client_ui_colorpicker_ColorPickerGradientConnector_2_classLit);\n  $setConstructor(this$static.val$store, Lcom_vaadin_client_ui_colorpicker_ColorPickerGradientConnector_2_classLit, new ConnectorBundleLoaderImpl$5$1$1(this$static));\n  $setConstructor(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, new ConnectorBundleLoaderImpl$5$1$2(this$static));\n  $setReturnType(this$static.val$store, Lcom_vaadin_client_ui_colorpicker_ColorPickerGradientConnector_2_classLit, 'getState', new Type(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit));\n  $loadJsBundle_3(this$static.val$store);\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'bgColor', new Type(Ljava_lang_String_2_classLit));\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'cursorY', new Type(Ljava_lang_Integer_2_classLit));\n  $setPropertyType(this$static.val$store, Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'cursorX', new Type(Ljava_lang_Integer_2_classLit));\n}\n\nfunction $loadJsBundle_3(store){\n  $loadNativeJs_3(store);\n}\n\nfunction $loadNativeJs_3(store){\n  var data_0 = {setter:function(bean, value_0){\n    bean.bgColor = value_0;\n  }\n  , getter:function(bean){\n    return bean.bgColor;\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'bgColor', data_0);\n  var data_0 = {setter:function(bean, value_0){\n    bean.cursorY = value_0.intValue();\n  }\n  , getter:function(bean){\n    return valueOf_58(bean.cursorY);\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'cursorY', data_0);\n  var data_0 = {setter:function(bean, value_0){\n    bean.cursorX = value_0.intValue();\n  }\n  , getter:function(bean){\n    return valueOf_58(bean.cursorX);\n  }\n  };\n  store.setPropertyData(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit, 'cursorX', data_0);\n}\n\ndefineClass(568, 1, $intern_102);\n_.onSuccess_1 = function onSuccess_6(){\n  $load_5(this);\n  $setLoaded_0(get_24(), $getName_4(this.this$1));\n}\n;\nfunction $$init_1016(){\n}\n\nfunction ConnectorBundleLoaderImpl$5$1$1(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1016();\n}\n\ndefineClass(465, 1, $intern_123, ConnectorBundleLoaderImpl$5$1$1);\n_.invoke_0 = function invoke_197(target, params){\n  return new ColorPickerGradientConnector;\n}\n;\nfunction $$init_1017(){\n}\n\nfunction ConnectorBundleLoaderImpl$5$1$2(this$2){\n  this , this$2;\n  Object_0.call(this);\n  $$init_1017();\n}\n\ndefineClass(1209, 1, $intern_123, ConnectorBundleLoaderImpl$5$1$2);\n_.invoke_0 = function invoke_198(target, params){\n  return new ColorPickerGradientState;\n}\n;\nfunction $$init_1376(this$static){\n  this$static.rpc = dynamicCast(create_14(Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientServerRpc_2_classLit, this$static), 920);\n}\n\nfunction $getState_18(this$static){\n  return dynamicCast($getState_4(this$static), 341);\n}\n\nfunction $getWidget_15(this$static){\n  return dynamicCast($getWidget_2(this$static), 272);\n}\n\nfunction ColorPickerGradientConnector(){\n  AbstractComponentConnector.call(this);\n  $$init_1376(this);\n}\n\ndefineClass(1399, 320, {808:1, 187:1, 5:1, 25:1, 1331:1, 320:1, 94:1, 59:1, 3:1}, ColorPickerGradientConnector);\n_.createWidget = function createWidget_3(){\n  return new VColorPickerGradient;\n}\n;\n_.getState = function getState_35(){\n  return $getState_18(this);\n}\n;\n_.getState_0 = function getState_36(){\n  return $getState_18(this);\n}\n;\n_.getWidget_0 = function getWidget_19(){\n  return $getWidget_15(this);\n}\n;\n_.init = function init_19(){\n  $init_3();\n  $addMouseUpHandler_0($getWidget_15(this), this);\n}\n;\n_.onMouseUp = function onMouseUp_6(event_0){\n  this.rpc.select_3($getCursorX($getWidget_15(this)), $getCursorY($getWidget_15(this)));\n}\n;\n_.onStateChanged = function onStateChanged_15(stateChangeEvent){\n  $onStateChanged_0(this, stateChangeEvent);\n  (stateChangeEvent.hasPropertyChanged('cursorX') || stateChangeEvent.hasPropertyChanged('cursorY')) && $setCursor_0($getWidget_15(this), $getState_18(this).cursorX, $getState_18(this).cursorY);\n  stateChangeEvent.hasPropertyChanged('bgColor') && $setBGColor($getWidget_15(this), $getState_18(this).bgColor);\n}\n;\nfunction $$init_1378(this$static){\n  this$static.mouseIsDown = false;\n  this$static , 220;\n  this$static , 220;\n}\n\nfunction $getCursorX(this$static){\n  return this$static.cursorX;\n}\n\nfunction $getCursorY(this$static){\n  return this$static.cursorY;\n}\n\nfunction $setBGColor(this$static, bgColor){\n  jsEquals(bgColor, null)?$clearBackgroundColor($getStyle($getElement(this$static.background))):$setBackgroundColor($getStyle($getElement(this$static.background)), bgColor);\n}\n\nfunction $setCursor_0(this$static, x_0, y_0){\n  this$static.cursorX = x_0;\n  this$static.cursorY = y_0;\n  x_0 >= 0 && $setWidth_1($getStyle($getElement(this$static.lowercross)), x_0, ($clinit_Style$Unit() , PX));\n  y_0 >= 0 && $setTop($getStyle($getElement(this$static.lowercross)), y_0, ($clinit_Style$Unit() , PX));\n  y_0 >= 0 && $setHeight_1($getStyle($getElement(this$static.lowercross)), 220 - y_0, ($clinit_Style$Unit() , PX));\n  x_0 >= 0 && $setWidth_1($getStyle($getElement(this$static.highercross)), 220 - x_0, ($clinit_Style$Unit() , PX));\n  x_0 >= 0 && $setLeft($getStyle($getElement(this$static.highercross)), x_0, ($clinit_Style$Unit() , PX));\n  y_0 >= 0 && $setHeight_1($getStyle($getElement(this$static.highercross)), y_0, ($clinit_Style$Unit() , PX));\n}\n\nfunction VColorPickerGradient(){\n  $clinit_FocusPanel();\n  FocusPanel.call(this);\n  $$init_1378(this);\n  this.setStyleName('v-colorpicker-gradient');\n  this.background = new HTML;\n  this.background.setStyleName('v-colorpicker-gradient-background');\n  $setPixelSize(this.background, 220, 220);\n  this.foreground = new HTML;\n  this.foreground.setStyleName('v-colorpicker-gradient-foreground');\n  $setPixelSize(this.foreground, 220, 220);\n  this.clicklayer = new HTML;\n  this.clicklayer.setStyleName('v-colorpicker-gradient-clicklayer');\n  $setPixelSize(this.clicklayer, 220, 220);\n  $addMouseDownHandler_0(this.clicklayer, this);\n  $addMouseUpHandler_1(this.clicklayer, this);\n  $addMouseMoveHandler(this.clicklayer, this);\n  this.lowercross = new HTML;\n  $setPixelSize(this.lowercross, 110, 110);\n  this.lowercross.setStyleName('v-colorpicker-gradient-lowerbox');\n  this.highercross = new HTML;\n  $setPixelSize(this.highercross, 110, 110);\n  this.highercross.setStyleName('v-colorpicker-gradient-higherbox');\n  this.container = new AbsolutePanel;\n  this.container.setStyleName('v-colorpicker-gradient-container');\n  $setPixelSize(this.container, 220, 220);\n  $add_4(this.container, this.background, 0, 0);\n  $add_4(this.container, this.foreground, 0, 0);\n  $add_4(this.container, this.lowercross, 0, 110);\n  $add_4(this.container, this.highercross, 110, 0);\n  $add_4(this.container, this.clicklayer, 0, 0);\n  $add_5(this, this.container);\n}\n\ndefineClass(272, 948, {2086:1, 2341:1, 2125:1, 2203:1, 2248:1, 2269:1, 2209:1, 256:1, 208:1, 1983:1, 2250:1, 2118:1, 2274:1, 2268:1, 2230:1, 1953:1, 2408:1, 2128:1, 1940:1, 2231:1, 2259:1, 1932:1, 2222:1, 2292:1, 2235:1, 2132:1, 2007:1, 2326:1, 2079:1, 1868:1, 2220:1, 1901:1, 1928:1, 822:1, 438:1, 808:1, 2388:1, 187:1, 2093:1, 1712:1, 2204:1, 46:1, 2189:1, 1925:1, 2227:1, 58:1, 2217:1, 1885:1, 147:1, 1081:1, 1934:1, 1904:1, 2270:1, 2182:1, 160:1, 9:1, 49:1, 272:1, 98:1}, VColorPickerGradient);\n_.getSubPartElement = function getSubPartElement_10(subPart){\n  if ($equals_12(subPart, 'clicklayer')) {\n    return $getElement(this.clicklayer);\n  }\n  return null;\n}\n;\n_.getSubPartName = function getSubPartName_10(subElement){\n  if ($isOrHasChild($getElement(this.clicklayer), subElement)) {\n    return 'clicklayer';\n  }\n  return null;\n}\n;\n_.onMouseDown = function onMouseDown_10(event_0){\n  $preventDefault_0(event_0);\n  this.mouseIsDown = true;\n  $setCursor_0(this, $getX(event_0), $getY(event_0));\n}\n;\n_.onMouseMove = function onMouseMove_4(event_0){\n  $preventDefault_0(event_0);\n  this.mouseIsDown && $setCursor_0(this, $getX(event_0), $getY(event_0));\n}\n;\n_.onMouseUp = function onMouseUp_7(event_0){\n  $preventDefault_0(event_0);\n  this.mouseIsDown = false;\n  $setCursor_0(this, $getX(event_0), $getY(event_0));\n  this.cursorX = $getX(event_0);\n  this.cursorY = $getY(event_0);\n}\n;\n_.cursorX = 0;\n_.cursorY = 0;\n_.mouseIsDown = false;\nfunction $$init_1565(){\n}\n\nfunction ColorPickerGradientState(){\n  AbstractComponentState.call(this);\n  $$init_1565();\n}\n\ndefineClass(341, 106, {106:1, 370:1, 341:1, 3:1}, ColorPickerGradientState);\n_.cursorX = 0;\n_.cursorY = 0;\nvar Lcom_vaadin_shared_ui_colorpicker_ColorPickerGradientState_2_classLit = createForClass('com.vaadin.shared.ui.colorpicker.', 'ColorPickerGradientState', 341, Lcom_vaadin_shared_AbstractComponentState_2_classLit), Lcom_vaadin_client_ui_colorpicker_ColorPickerGradientConnector_2_classLit = createForClass('com.vaadin.client.ui.colorpicker.', 'ColorPickerGradientConnector', 1399, Lcom_vaadin_client_ui_AbstractComponentConnector_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$5$1$1_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$5$1$1', 465, Ljava_lang_Object_2_classLit), Lcom_vaadin_client_metadata_ConnectorBundleLoaderImpl$5$1$2_2_classLit = createForClass('com.vaadin.client.metadata.', 'ConnectorBundleLoaderImpl$5$1$2', 1209, Ljava_lang_Object_2_classLit), Lcom_google_gwt_user_client_ui_FocusPanel_2_classLit = createForClass('com.google.gwt.user.client.ui.', 'FocusPanel', 948, Lcom_google_gwt_user_client_ui_SimplePanel_2_classLit), Lcom_vaadin_client_ui_colorpicker_VColorPickerGradient_2_classLit = createForClass('com.vaadin.client.ui.colorpicker.', 'VColorPickerGradient', 272, Lcom_google_gwt_user_client_ui_FocusPanel_2_classLit);\n$entry(onLoad)(5);\n\n//# sourceURL=com.rht.rht2.web.widgetset.RHT2_webWidgetset-5.js\n")
