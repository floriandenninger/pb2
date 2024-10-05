package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqp implements uqo {
    private final Context a;

    public uqp(Context context) {
        this.a = context;
    }

    @Override // defpackage.uqo
    public /* bridge */ /* synthetic */ List a(int i, int i2, String str, long j) {
        return b(0, 0, str, j);
    }

    public amru b(int i, int i2, String str, long j) {
        int i3;
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        activityManager.getClass();
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        amrp f = amru.f();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (!applicationExitInfo.getProcessName().equals(str) || applicationExitInfo.getTimestamp() != j) {
                aone createBuilder = baas.a.createBuilder();
                String processName = applicationExitInfo.getProcessName();
                createBuilder.copyOnWrite();
                baas baasVar = (baas) createBuilder.instance;
                processName.getClass();
                baasVar.b |= 1;
                baasVar.c = processName;
                int status = applicationExitInfo.getStatus();
                createBuilder.copyOnWrite();
                baas baasVar2 = (baas) createBuilder.instance;
                int i4 = 4;
                baasVar2.b |= 4;
                baasVar2.e = status;
                long timestamp = applicationExitInfo.getTimestamp();
                createBuilder.copyOnWrite();
                baas baasVar3 = (baas) createBuilder.instance;
                baasVar3.b |= 16;
                baasVar3.g = timestamp;
                long pss = applicationExitInfo.getPss();
                createBuilder.copyOnWrite();
                baas baasVar4 = (baas) createBuilder.instance;
                baasVar4.b |= 32;
                baasVar4.h = pss;
                long rss = applicationExitInfo.getRss();
                createBuilder.copyOnWrite();
                baas baasVar5 = (baas) createBuilder.instance;
                baasVar5.b |= 64;
                baasVar5.i = rss;
                boolean isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                createBuilder.copyOnWrite();
                baas baasVar6 = (baas) createBuilder.instance;
                baasVar6.b |= 128;
                baasVar6.j = isLowMemoryKillReportSupported;
                switch (applicationExitInfo.getReason()) {
                    case 0:
                        i3 = 15;
                        break;
                    case 1:
                        i3 = 2;
                        break;
                    case 2:
                        i3 = 3;
                        break;
                    case 3:
                        i3 = 4;
                        break;
                    case 4:
                        i3 = 5;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 8;
                        break;
                    case 8:
                        i3 = 9;
                        break;
                    case 9:
                        i3 = 10;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                    case 11:
                        i3 = 12;
                        break;
                    case 12:
                        i3 = 13;
                        break;
                    case 13:
                        i3 = 14;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                if (i3 != 0) {
                    createBuilder.copyOnWrite();
                    baas baasVar7 = (baas) createBuilder.instance;
                    baasVar7.d = i3 - 1;
                    baasVar7.b |= 2;
                }
                int importance = applicationExitInfo.getImportance();
                if (importance == 100) {
                    i4 = 2;
                } else if (importance == 125) {
                    i4 = 3;
                } else if (importance == 200) {
                    i4 = 5;
                } else if (importance == 230) {
                    i4 = 6;
                } else if (importance == 300) {
                    i4 = 8;
                } else if (importance != 325) {
                    i4 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
                }
                if (i4 != 0) {
                    createBuilder.copyOnWrite();
                    baas baasVar8 = (baas) createBuilder.instance;
                    baasVar8.f = i4 - 1;
                    baasVar8.b |= 8;
                }
                f.h((baas) createBuilder.build());
            } else {
                return f.g();
            }
        }
        return f.g();
    }
}
