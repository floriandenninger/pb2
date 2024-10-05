package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apw {
    public final aok a;
    public final aqa b;

    public apw() {
    }

    public static apw a(aok aokVar) {
        return new apw(aokVar, ((apu) aokVar).getViewModelStore());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        aqa aqaVar = this.b;
        if (aqaVar.b.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < aqaVar.b.c(); i++) {
                apx apxVar = (apx) aqaVar.b.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aqaVar.b.b(i));
                printWriter.print(": ");
                printWriter.println(apxVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(apxVar.e);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(apxVar.f);
                aqe aqeVar = apxVar.f;
                String str3 = str2 + "  ";
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(aqeVar.d);
                printWriter.print(" mListener=");
                printWriter.println(aqeVar.e);
                if (aqeVar.g || aqeVar.j) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(aqeVar.g);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aqeVar.j);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aqeVar.h || aqeVar.i) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aqeVar.h);
                    printWriter.print(" mReset=");
                    printWriter.println(aqeVar.i);
                }
                aqc aqcVar = (aqc) aqeVar;
                if (aqcVar.a != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(aqcVar.a);
                    printWriter.print(" waiting=");
                    boolean z = aqcVar.a.a;
                    printWriter.println(false);
                }
                if (aqcVar.b != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aqcVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = aqcVar.b.a;
                    printWriter.println(false);
                }
                if (apxVar.g != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(apxVar.g);
                    apy apyVar = apxVar.g;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(apyVar.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                aqe aqeVar2 = apxVar.f;
                printWriter.println(aqe.e(apxVar.b()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(apxVar.m());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.a)));
        sb.append("}}");
        return sb.toString();
    }

    public apw(aok aokVar, apt aptVar) {
        this.a = aokVar;
        this.b = (aqa) new aps(aptVar, aqa.a).a(aqa.class);
    }
}
