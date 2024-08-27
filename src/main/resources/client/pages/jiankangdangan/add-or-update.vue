<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 0 0","position":"relative","background":"#ff993310","height":"auto"}'>
		<form :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">手机</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">姓名</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">医生手机</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.yishengshouji" v-model="ruleForm.yishengshouji" placeholder="医生手机"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">医生姓名</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.yishengxingming" v-model="ruleForm.yishengxingming" placeholder="医生姓名"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">病史记录</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.bingshijilu" v-model="ruleForm.bingshijilu" placeholder="病史记录"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">诊断结果</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.zhenduanjieguo" v-model="ruleForm.zhenduanjieguo" placeholder="诊断结果"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">需要注意</view>
				<input :style='{"border":"2rpx solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"#ffffff","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}' :disabled="ro.xuyaozhuyi" v-model="ruleForm.xuyaozhuyi" placeholder="需要注意"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="dangantupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">档案图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.dangantupian" :src="baseUrl+ruleForm.dangantupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0 12rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","fontWeight":"500"}' class="title">诊断详情</view>
                <xia-editor ref="editor" :style='{"minHeight":"320rpx","border":"2rpx solid #eeeeee","padding":"20rpx","color":"#666666","background":"#ffffff","width":"100%","height":"auto"}' v-model="ruleForm.zhenduanxiangqing" placeholder="诊断详情" @editorChange="zhenduanxiangqingChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0px solid #eeeeee","padding":"0 0 0 0","margin":"0 4% 0 0","color":"#fff","borderRadius":"40rpx","background":"#ff9933","width":"30%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				shouji: '',
				xingming: '',
				yishengshouji: '',
				yishengxingming: '',
				bingshijilu: '',
				zhenduanjieguo: '',
				zhenduanxiangqing: '',
				xuyaozhuyi: '',
				dangantupian: '',
				crossuserid: '',
				crossrefid: '',
				},
				// 登录用户信息
				user: {},
                ro:{
                   shouji : false,
                   xingming : false,
                   yishengshouji : false,
                   yishengxingming : false,
                   bingshijilu : false,
                   zhenduanjieguo : false,
                   zhenduanxiangqing : false,
                   xuyaozhuyi : false,
                   dangantupian : false,
                   crossuserid : false,
                   crossrefid : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		watch:{
		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yishengshouji = this.user.yishengshouji
			this.ro.yishengshouji = true;
			this.ruleForm.yishengxingming = this.user.yishengxingming
			this.ro.yishengxingming = true;



			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`jiankangdangan`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					this.ro.shouji = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='yishengshouji'){
					this.ruleForm.yishengshouji = obj[o];
					this.ro.yishengshouji = true;
					continue;
					}
					if(o=='yishengxingming'){
					this.ruleForm.yishengxingming = obj[o];
					this.ro.yishengxingming = true;
					continue;
					}
					if(o=='bingshijilu'){
					this.ruleForm.bingshijilu = obj[o];
					this.ro.bingshijilu = true;
					continue;
					}
					if(o=='zhenduanjieguo'){
					this.ruleForm.zhenduanjieguo = obj[o];
					this.ro.zhenduanjieguo = true;
					continue;
					}
					if(o=='zhenduanxiangqing'){
					this.ruleForm.zhenduanxiangqing = obj[o];
					this.ro.zhenduanxiangqing = true;
					continue;
					}
					if(o=='xuyaozhuyi'){
					this.ruleForm.xuyaozhuyi = obj[o];
					this.ro.xuyaozhuyi = true;
					continue;
					}
					if(o=='dangantupian'){
					this.ruleForm.dangantupian = obj[o].split(",")[0];
					this.ro.dangantupian = true;
					continue;
					}
					if(o=='crossuserid'){
					this.ruleForm.crossuserid = obj[o];
					this.ro.crossuserid = true;
					continue;
					}
					if(o=='crossrefid'){
					this.ruleForm.crossrefid = obj[o];
					this.ro.crossrefid = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		methods: {
            zhenduanxiangqingChange(e) {
                this.ruleForm.zhenduanxiangqing = e
            },
			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#ff9933"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#ff9933"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #ff9933","borderRadius":"0","color":"#ff9933","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #ff9933","color":"#ff9933","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},

			// 多级联动参数



			dangantupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.dangantupian = 'file/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {























//跨表计算判断
				var obj;
				if((!this.ruleForm.bingshijilu)){
					this.$utils.msg(`病史记录不能为空`);
					return
				}
				if((!this.ruleForm.zhenduanjieguo)){
					this.$utils.msg(`诊断结果不能为空`);
					return
				}
				if((!this.ruleForm.zhenduanxiangqing)){
					this.$utils.msg(`诊断详情不能为空`);
					return
				}
				if((!this.ruleForm.xuyaozhuyi)){
					this.$utils.msg(`需要注意不能为空`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`jiankangdangan`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`jiankangdangan`, this.ruleForm);
						}else{
							await this.$api.add(`jiankangdangan`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`jiankangdangan`, this.ruleForm);
					}else{
						await this.$api.add(`jiankangdangan`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
