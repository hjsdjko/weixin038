(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-jiankangdangan-add-or-update"],{"3c55":function(e,r,i){"use strict";var t=i("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,i("a481"),i("c5f6"),i("f559"),i("456d"),i("ac6a"),i("28a5"),i("96cf");var n=t(i("3b8d")),o=t(i("e2b1")),a=t(i("064f")),s=t(i("bd56")),u={data:function(){return{cross:"",ruleForm:{shouji:"",xingming:"",yishengshouji:"",yishengxingming:"",bingshijilu:"",zhenduanjieguo:"",zhenduanxiangqing:"",xuyaozhuyi:"",dangantupian:"",crossuserid:"",crossrefid:""},user:{},ro:{shouji:!1,xingming:!1,yishengshouji:!1,yishengxingming:!1,bingshijilu:!1,zhenduanjieguo:!1,zhenduanxiangqing:!1,xuyaozhuyi:!1,dangantupian:!1,crossuserid:!1,crossrefid:!1}}},components:{wPicker:o.default,xiaEditor:a.default,multipleSelect:s.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(r){var i,t,n,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return i=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(i);case 3:if(t=e.sent,this.user=t.data,this.ruleForm.yishengshouji=this.user.yishengshouji,this.ro.yishengshouji=!0,this.ruleForm.yishengxingming=this.user.yishengxingming,this.ro.yishengxingming=!0,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=17;break}return this.ruleForm.id=r.id,e.next=15,this.$api.info("jiankangdangan",this.ruleForm.id);case 15:t=e.sent,this.ruleForm=t.data;case 17:if(this.cross=r.cross,!r.cross){e.next=69;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 21:if((e.t1=e.t0()).done){e.next=69;break}if(o=e.t1.value,"shouji"!=o){e.next=27;break}return this.ruleForm.shouji=n[o],this.ro.shouji=!0,e.abrupt("continue",21);case 27:if("xingming"!=o){e.next=31;break}return this.ruleForm.xingming=n[o],this.ro.xingming=!0,e.abrupt("continue",21);case 31:if("yishengshouji"!=o){e.next=35;break}return this.ruleForm.yishengshouji=n[o],this.ro.yishengshouji=!0,e.abrupt("continue",21);case 35:if("yishengxingming"!=o){e.next=39;break}return this.ruleForm.yishengxingming=n[o],this.ro.yishengxingming=!0,e.abrupt("continue",21);case 39:if("bingshijilu"!=o){e.next=43;break}return this.ruleForm.bingshijilu=n[o],this.ro.bingshijilu=!0,e.abrupt("continue",21);case 43:if("zhenduanjieguo"!=o){e.next=47;break}return this.ruleForm.zhenduanjieguo=n[o],this.ro.zhenduanjieguo=!0,e.abrupt("continue",21);case 47:if("zhenduanxiangqing"!=o){e.next=51;break}return this.ruleForm.zhenduanxiangqing=n[o],this.ro.zhenduanxiangqing=!0,e.abrupt("continue",21);case 51:if("xuyaozhuyi"!=o){e.next=55;break}return this.ruleForm.xuyaozhuyi=n[o],this.ro.xuyaozhuyi=!0,e.abrupt("continue",21);case 55:if("dangantupian"!=o){e.next=59;break}return this.ruleForm.dangantupian=n[o].split(",")[0],this.ro.dangantupian=!0,e.abrupt("continue",21);case 59:if("crossuserid"!=o){e.next=63;break}return this.ruleForm.crossuserid=n[o],this.ro.crossuserid=!0,e.abrupt("continue",21);case 63:if("crossrefid"!=o){e.next=67;break}return this.ruleForm.crossrefid=n[o],this.ro.crossrefid=!0,e.abrupt("continue",21);case 67:e.next=21;break;case 69:this.styleChange(),this.$forceUpdate();case 71:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),computed:{baseUrl:function(){return this.$base.url}},methods:{zhenduanxiangqingChange:function(e){this.ruleForm.zhenduanxiangqing=e},styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#ff9933"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#ff9933"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #ff9933",borderRadius:"0",color:"#ff9933",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #ff9933",color:"#ff9933",borderRadius:"0",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))}))}))},dangantupianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.dangantupian="file/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var r,i,t,n,o,a,s,u,l,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.bingshijilu){e.next=3;break}return this.$utils.msg("病史记录不能为空"),e.abrupt("return");case 3:if(this.ruleForm.zhenduanjieguo){e.next=6;break}return this.$utils.msg("诊断结果不能为空"),e.abrupt("return");case 6:if(this.ruleForm.zhenduanxiangqing){e.next=9;break}return this.$utils.msg("诊断详情不能为空"),e.abrupt("return");case 9:if(this.ruleForm.xuyaozhuyi){e.next=12;break}return this.$utils.msg("需要注意不能为空"),e.abrupt("return");case 12:if(!this.cross){e.next=29;break}if(uni.setStorageSync("crossCleanType",!0),o=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==o){e.next=29;break}if(r||(r=uni.getStorageSync("crossObj")),o.startsWith("[")){e.next=25;break}for(s in r)s==o&&(r[s]=a);return u=uni.getStorageSync("crossTable"),e.next=23,this.$api.update("".concat(u),r);case 23:e.next=29;break;case 25:i=Number(uni.getStorageSync("userid")),t=r["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 29:if(!t||!i){e.next=52;break}return this.ruleForm.crossuserid=i,this.ruleForm.crossrefid=t,l={page:1,limit:10,crossuserid:i,crossrefid:t},e.next=35,this.$api.list("jiankangdangan",l);case 35:if(d=e.sent,!(d.data.total>=n)){e.next=42;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 42:if(!this.ruleForm.id){e.next=47;break}return e.next=45,this.$api.update("jiankangdangan",this.ruleForm);case 45:e.next=49;break;case 47:return e.next=49,this.$api.add("jiankangdangan",this.ruleForm);case 49:this.$utils.msgBack("提交成功");case 50:e.next=60;break;case 52:if(!this.ruleForm.id){e.next=57;break}return e.next=55,this.$api.update("jiankangdangan",this.ruleForm);case 55:e.next=59;break;case 57:return e.next=59,this.$api.add("jiankangdangan",this.ruleForm);case 59:this.$utils.msgBack("提交成功");case 60:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,i=r.getFullYear(),t=r.getMonth()+1,n=r.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,n=n>9?n:"0"+n,"".concat(i,"-").concat(t,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};r.default=u},"43f9":function(e,r,i){"use strict";i.r(r);var t=i("3c55"),n=i.n(t);for(var o in t)"default"!==o&&function(e){i.d(r,e,(function(){return t[e]}))}(o);r["default"]=n.a},"6d16":function(e,r,i){"use strict";i.r(r);var t=i("6fbf"),n=i("43f9");for(var o in n)"default"!==o&&function(e){i.d(r,e,(function(){return n[e]}))}(o);i("ed30");var a,s=i("f0c5"),u=Object(s["a"])(n["default"],t["b"],t["c"],!1,null,"5bc2510a",null,!1,t["a"],a);r["default"]=u.exports},"6fbf":function(e,r,i){"use strict";var t={"xia-editor":i("064f").default},n=function(){var e=this,r=e.$createElement,i=e._self._c||r;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ff993310",height:"auto"}},[i("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"none",display:"block",height:"auto"}},[i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("手机")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.shouji,placeholder:"手机"},model:{value:e.ruleForm.shouji,callback:function(r){e.$set(e.ruleForm,"shouji",r)},expression:"ruleForm.shouji"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("姓名")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.xingming,placeholder:"姓名"},model:{value:e.ruleForm.xingming,callback:function(r){e.$set(e.ruleForm,"xingming",r)},expression:"ruleForm.xingming"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("医生手机")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.yishengshouji,placeholder:"医生手机"},model:{value:e.ruleForm.yishengshouji,callback:function(r){e.$set(e.ruleForm,"yishengshouji",r)},expression:"ruleForm.yishengshouji"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("医生姓名")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.yishengxingming,placeholder:"医生姓名"},model:{value:e.ruleForm.yishengxingming,callback:function(r){e.$set(e.ruleForm,"yishengxingming",r)},expression:"ruleForm.yishengxingming"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("病史记录")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.bingshijilu,placeholder:"病史记录"},model:{value:e.ruleForm.bingshijilu,callback:function(r){e.$set(e.ruleForm,"bingshijilu",r)},expression:"ruleForm.bingshijilu"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("诊断结果")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.zhenduanjieguo,placeholder:"诊断结果"},model:{value:e.ruleForm.zhenduanjieguo,callback:function(r){e.$set(e.ruleForm,"zhenduanjieguo",r)},expression:"ruleForm.zhenduanjieguo"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("需要注意")]),i("v-uni-input",{style:{border:"2rpx solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"0px",flex:"1",background:"#ffffff",fontSize:"28rpx",lineHeight:"64rpx",height:"64rpx"},attrs:{disabled:e.ro.xuyaozhuyi,placeholder:"需要注意"},model:{value:e.ruleForm.xuyaozhuyi,callback:function(r){e.$set(e.ruleForm,"xuyaozhuyi",r)},expression:"ruleForm.xuyaozhuyi"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.dangantupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("档案图片")]),e.ruleForm.dangantupian?i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.dangantupian.split(",")[0],mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),i("v-uni-view",{style:{padding:"12rpx 0 12rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",fontWeight:"500"}},[e._v("诊断详情")]),i("xia-editor",{ref:"editor",style:{minHeight:"320rpx",border:"2rpx solid #eeeeee",padding:"20rpx",color:"#666666",background:"#ffffff",width:"100%",height:"auto"},attrs:{placeholder:"诊断详情"},on:{editorChange:function(r){arguments[0]=r=e.$handleEvent(r),e.zhenduanxiangqingChange.apply(void 0,arguments)}},model:{value:e.ruleForm.zhenduanxiangqing,callback:function(r){e.$set(e.ruleForm,"zhenduanxiangqing",r)},expression:"ruleForm.zhenduanxiangqing"}})],1),i("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[i("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#fff",borderRadius:"40rpx",background:"#ff9933",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},o=[];i.d(r,"b",(function(){return n})),i.d(r,"c",(function(){return o})),i.d(r,"a",(function(){return t}))},a4c2:function(e,r,i){var t=i("fce1");"string"===typeof t&&(t=[[e.i,t,""]]),t.locals&&(e.exports=t.locals);var n=i("4f06").default;n("10f4c17c",t,!0,{sourceMap:!1,shadowMode:!1})},ed30:function(e,r,i){"use strict";var t=i("a4c2"),n=i.n(t);n.a},fce1:function(e,r,i){var t=i("24fb");r=t(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-5bc2510a]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=r}}]);