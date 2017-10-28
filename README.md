```
java.lang.BootstrapMethodError: call site initialization exception
	at java.lang.invoke.MemberName.makeAccessException(MemberName.java:850)
	at java.lang.invoke.MethodHandles$Lookup.checkAccess(MethodHandles.java:1536)
	at java.lang.invoke.MethodHandles$Lookup.revealDirect(MethodHandles.java:1357)
	at java.lang.invoke.AbstractValidatingLambdaMetafactory.<init>(AbstractValidatingLambdaMetafactory.java:131)
	at java.lang.invoke.InnerClassLambdaMetafactory.<init>(InnerClassLambdaMetafactory.java:155)
	at java.lang.invoke.LambdaMetafactory.metafactory(LambdaMetafactory.java:299)
	at java.lang.invoke.CallSite.makeSite(CallSite.java:302)
	at java.lang.invoke.MethodHandleNatives.linkCallSiteImpl(MethodHandleNatives.java:307)
	at java.lang.invoke.MethodHandleNatives.linkCallSite(MethodHandleNatives.java:297)
	at test.TestBug.testBug(TestBug.java:12)
