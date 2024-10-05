package defpackage;

import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class svs extends syd {
    private final azrw a;

    public svs(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.syd
    public final void a(int i, String str, sxc sxcVar, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        aone createBuilder = aoqa.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).b = currentTimeMillis / 1000;
        createBuilder.copyOnWrite();
        ((aoqa) createBuilder.instance).c = (int) ((currentTimeMillis % 1000) * 1000000);
        aoqa aoqaVar = (aoqa) createBuilder.build();
        int i2 = i == 12 ? 3 : 4;
        aone createBuilder2 = awsb.a.createBuilder();
        createBuilder2.copyOnWrite();
        awsb awsbVar = (awsb) createBuilder2.instance;
        awsbVar.e = i2 - 1;
        awsbVar.b |= 4;
        createBuilder2.copyOnWrite();
        awsb awsbVar2 = (awsb) createBuilder2.instance;
        awsbVar2.b |= 8;
        awsbVar2.f = awxr.C(i);
        createBuilder2.copyOnWrite();
        awsb awsbVar3 = (awsb) createBuilder2.instance;
        str.getClass();
        awsbVar3.b |= 1;
        awsbVar3.c = str;
        createBuilder2.copyOnWrite();
        awsb awsbVar4 = (awsb) createBuilder2.instance;
        aoqaVar.getClass();
        awsbVar4.d = aoqaVar;
        awsbVar4.b |= 2;
        if (th != null) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append('\n');
            sb.append(valueOf);
            String sb2 = sb.toString();
            createBuilder2.copyOnWrite();
            awsb awsbVar5 = (awsb) createBuilder2.instance;
            sb2.getClass();
            awsbVar5.b |= 1;
            awsbVar5.c = sb2;
            aone createBuilder3 = awsc.a.createBuilder();
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                aone createBuilder4 = awrz.a.createBuilder();
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(className).length() + 1 + String.valueOf(methodName).length());
                sb3.append(className);
                sb3.append(".");
                sb3.append(methodName);
                String sb4 = sb3.toString();
                createBuilder4.copyOnWrite();
                awrz awrzVar = (awrz) createBuilder4.instance;
                sb4.getClass();
                awrzVar.b |= 1;
                awrzVar.c = sb4;
                int lineNumber = stackTraceElement.getLineNumber();
                if (lineNumber >= 0) {
                    createBuilder4.copyOnWrite();
                    awrz awrzVar2 = (awrz) createBuilder4.instance;
                    awrzVar2.b |= 4;
                    awrzVar2.e = lineNumber;
                }
                String fileName = stackTraceElement.getFileName();
                if (fileName != null) {
                    createBuilder4.copyOnWrite();
                    awrz awrzVar3 = (awrz) createBuilder4.instance;
                    awrzVar3.b |= 2;
                    awrzVar3.d = fileName;
                }
                awrz awrzVar4 = (awrz) createBuilder4.build();
                createBuilder3.copyOnWrite();
                awsc awscVar = (awsc) createBuilder3.instance;
                awrzVar4.getClass();
                aony aonyVar = awscVar.b;
                if (!aonyVar.c()) {
                    awscVar.b = aonm.mutableCopy(aonyVar);
                }
                awscVar.b.add(awrzVar4);
            }
            awsc awscVar2 = (awsc) createBuilder3.build();
            createBuilder2.copyOnWrite();
            awsb awsbVar6 = (awsb) createBuilder2.instance;
            awscVar2.getClass();
            awsbVar6.g = awscVar2;
            awsbVar6.b |= 16;
        }
        ((DebuggerClient) this.a.get()).sendLog(((awsb) createBuilder2.build()).toByteArray());
    }
}
