package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class raj {
    private static final Method a;
    private static final Method b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 0
            r3 = 24
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            if (r0 < r3) goto L36
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class<android.app.job.JobInfo> r6 = android.app.job.JobInfo.class
            r0[r2] = r6     // Catch: java.lang.NoSuchMethodException -> L2a
            r6 = 1
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0[r6] = r7     // Catch: java.lang.NoSuchMethodException -> L2a
            r6 = 2
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L2a
            r0[r6] = r7     // Catch: java.lang.NoSuchMethodException -> L2a
            r6 = 3
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0[r6] = r7     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class<android.app.job.JobScheduler> r6 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L2a
            goto L37
        L2a:
            boolean r0 = android.util.Log.isLoggable(r4, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r4, r0)
        L36:
            r0 = r5
        L37:
            defpackage.raj.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L54
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r3 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L48
            goto L54
        L48:
            boolean r0 = android.util.Log.isLoggable(r4, r1)
            if (r0 == 0) goto L54
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r4, r0)
        L54:
            defpackage.raj.b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raj.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, android.app.job.JobInfo r7) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.getClass()
            java.lang.reflect.Method r1 = defpackage.raj.a
            if (r1 == 0) goto L72
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            int r6 = r6.checkSelfPermission(r1)
            if (r6 == 0) goto L18
            goto L72
        L18:
            java.lang.reflect.Method r6 = defpackage.raj.b
            r1 = 0
            if (r6 == 0) goto L3f
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Object r6 = r6.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            if (r6 == 0) goto L3f
            int r6 = r6.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            goto L40
        L2e:
            r6 = move-exception
            goto L31
        L30:
            r6 = move-exception
        L31:
            r2 = 6
            java.lang.String r3 = "JobSchedulerCompat"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L3f
            java.lang.String r2 = "myUserId invocation illegal"
            android.util.Log.e(r3, r2, r6)
        L3f:
            r6 = 0
        L40:
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "UploadAlarm"
            java.lang.reflect.Method r4 = defpackage.raj.a
            if (r4 == 0) goto L6e
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            r5[r1] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            r1 = 1
            r5[r1] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            r1 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            r5[r1] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            r6 = 3
            r5[r6] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            java.lang.Object r6 = r4.invoke(r0, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
            if (r6 == 0) goto L65
            r6.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L66 java.lang.IllegalAccessException -> L68
        L65:
            return
        L66:
            r6 = move-exception
            goto L69
        L68:
            r6 = move-exception
        L69:
            java.lang.String r1 = "error calling scheduleAsPackage"
            android.util.Log.e(r3, r1, r6)
        L6e:
            r0.schedule(r7)
            return
        L72:
            r0.schedule(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.raj.a(android.content.Context, android.app.job.JobInfo):void");
    }
}
