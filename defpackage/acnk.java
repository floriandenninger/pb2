package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnk implements StatsObserver {
    private static final float f = 1.0f / ((float) TimeUnit.SECONDS.toNanos(1));
    public abuc a;
    public abuc b;
    public int c;
    public long d;
    public long e;

    private static final Map a(StatsReport.Value[] valueArr) {
        HashMap hashMap = new HashMap();
        for (StatsReport.Value value : valueArr) {
            hashMap.put(value.a, value.b);
        }
        return hashMap;
    }

    private static final String b(Map map, String str) {
        String str2 = (String) map.get(str);
        return str2 == null ? "" : str2;
    }

    private static final String c(StatsReport.Value[] valueArr) {
        for (StatsReport.Value value : valueArr) {
            if ("mediaType".equals(value.a)) {
                return value.b;
            }
        }
        return "";
    }

    @Override // org.webrtc.StatsObserver
    public final void onComplete(StatsReport[] statsReportArr) {
        StatsReport statsReport;
        StatsReport statsReport2;
        String str;
        String str2;
        Integer num;
        int length = statsReportArr.length;
        int i = 0;
        while (true) {
            statsReport = null;
            if (i >= length) {
                statsReport2 = null;
                break;
            }
            statsReport2 = statsReportArr[i];
            if ("ssrc".equals(statsReport2.b) && "video".equals(c(statsReport2.d))) {
                break;
            } else {
                i++;
            }
        }
        int length2 = statsReportArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            StatsReport statsReport3 = statsReportArr[i2];
            if ("ssrc".equals(statsReport3.b) && "audio".equals(c(statsReport3.d))) {
                statsReport = statsReport3;
                break;
            }
            i2++;
        }
        if (statsReport2 != null) {
            Map a = a(statsReport2.d);
            String b = b(a, "googFrameWidthInput");
            String b2 = b(a, "googFrameHeightInput");
            String b3 = b(a, "googFrameWidthSent");
            String b4 = b(a, "googFrameHeightSent");
            String b5 = b(a, "googFrameRateInput");
            String b6 = b(a, "googFrameRateSent");
            String b7 = b(a, "googBandwidthLimitedResolution");
            String b8 = b(a, "googCpuLimitedResolution");
            String b9 = b(a, "googAvgEncodeMs");
            String b10 = b(a, "bytesSent");
            String b11 = b(a, "googAdaptationChanges");
            b(a, "googCodecName");
            int intValue = ((Integer) amkq.Z(anaf.ah(b), 0)).intValue();
            int intValue2 = ((Integer) amkq.Z(anaf.ah(b2), 0)).intValue();
            int intValue3 = ((Integer) amkq.Z(anaf.ah(b3), 0)).intValue();
            int intValue4 = ((Integer) amkq.Z(anaf.ah(b4), 0)).intValue();
            int intValue5 = ((Integer) amkq.Z(anaf.ah(b5), 0)).intValue();
            int intValue6 = ((Integer) amkq.Z(anaf.ah(b6), 0)).intValue();
            Boolean.parseBoolean(b7);
            Boolean.parseBoolean(b8);
            int intValue7 = ((Integer) amkq.Z(anaf.ah(b9), 0)).intValue();
            int intValue8 = ((Integer) amkq.Z(anaf.ah(b10), 0)).intValue();
            int intValue9 = ((Integer) amkq.Z(anaf.ah(b11), 0)).intValue();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            num = 0;
            int i3 = (intValue8 - this.c) * 8;
            str = "googCodecName";
            str2 = "bytesSent";
            float f2 = ((float) (elapsedRealtimeNanos - this.d)) * f;
            int i4 = f2 > 0.0f ? (int) (i3 / f2) : 0;
            this.c = intValue8;
            this.d = elapsedRealtimeNanos;
            if (i4 >= 1.0f) {
                this.e = elapsedRealtimeNanos;
            }
            abuc abucVar = new abuc(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, i4, intValue8, intValue9);
            this.b = abucVar;
            abuc abucVar2 = this.a;
            if (abucVar2 == null) {
                this.a = abucVar;
            } else {
                if (intValue == 0) {
                    intValue = abucVar2.a;
                }
                int i5 = intValue;
                if (intValue2 == 0) {
                    intValue2 = abucVar2.b;
                }
                int i6 = intValue2;
                if (intValue3 == 0) {
                    intValue3 = abucVar2.c;
                }
                int i7 = intValue3;
                if (intValue4 == 0) {
                    intValue4 = abucVar2.d;
                }
                int i8 = intValue4;
                if (intValue5 == 0) {
                    intValue5 = abucVar2.e;
                }
                int i9 = intValue5;
                if (intValue6 == 0) {
                    intValue6 = abucVar2.f;
                }
                int i10 = intValue6;
                if (intValue7 == 0) {
                    intValue7 = abucVar2.g;
                }
                int i11 = intValue7;
                if (i4 == 0) {
                    i4 = abucVar2.h;
                }
                int i12 = i4;
                if (intValue8 == 0) {
                    intValue8 = abucVar2.i;
                }
                int i13 = intValue8;
                if (intValue9 == 0) {
                    intValue9 = abucVar2.j;
                }
                this.a = new abuc(i5, i6, i7, i8, i9, i10, i11, i12, i13, intValue9);
            }
        } else {
            str = "googCodecName";
            str2 = "bytesSent";
            num = 0;
        }
        if (statsReport != null) {
            Map a2 = a(statsReport.d);
            String b12 = b(a2, "audioInputLevel");
            String b13 = b(a2, str2);
            b(a2, str);
            Integer ah = anaf.ah(b12);
            Integer num2 = num;
            ((Integer) amkq.Z(ah, num2)).intValue();
            ((Integer) amkq.Z(anaf.ah(b13), num2)).intValue();
        }
    }
}
