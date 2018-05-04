# android



Android 代码收集录
===
	/*隐藏标题栏*/
	if (getSupportActionBar() != null){
	   getSupportActionBar().hide();
	}
	
	
	 /*** 销毁这个活动  */
	 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_TASK_ON_HOME);	
