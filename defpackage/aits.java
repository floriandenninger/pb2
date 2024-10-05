package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aits implements aitq {
    private static final Pattern a = Pattern.compile("X-TIMESTAMP-MAP=LOCAL:\\S+,MPEGTS:(\\d+)", 2);
    private final zfi b;

    public aits(zfi zfiVar) {
        this.b = zfiVar;
    }

    @Override // defpackage.aitq
    public final void a(aitt aittVar, pth pthVar, long j, int i) {
        aitt aittVar2;
        int i2;
        pru pruVar;
        long j2;
        aitt aittVar3 = aittVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
        } catch (pnr unused) {
            aittVar2 = aittVar3;
        }
        try {
            if (!"WEBVTT".equals(pthVar.s())) {
                throw pnr.a("Missing WEBVTT header", null);
            }
            String s = pthVar.s();
            long j3 = 0;
            while (true) {
                if (s != null && s.isEmpty()) {
                    break;
                }
                aitt aittVar4 = aittVar3;
                if (s != null && s.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = a.matcher(s);
                    String group = matcher.matches() ? matcher.group(1) : null;
                    double parseLong = group != null ? Long.parseLong(group) : 0L;
                    Double.isNaN(parseLong);
                    j3 = (long) (parseLong * 11.1111111d);
                }
                s = pthVar.s();
                aittVar3 = aittVar4;
            }
            while (true) {
                pru d = prz.d(pthVar, Collections.emptyList());
                if (d == null) {
                    break;
                } else {
                    arrayList2.add(new pru(d.a, d.b + j3, d.c + j3));
                }
            }
            aittVar3.b(j3 / 1000);
            long size = arrayList2.size();
            int i3 = 0;
            pru pruVar2 = (pru) arrayList2.get(0);
            long j4 = pruVar2.b;
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                long j5 = i3;
                if (j5 >= size) {
                    break;
                }
                long j6 = pruVar2.c;
                String valueOf = String.valueOf(pruVar2.a.c);
                long j7 = j6;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                sb.append("");
                sb.append(valueOf);
                String sb2 = sb.toString();
                long j8 = (-1) + size;
                if (j5 < j8) {
                    int i4 = i3 + 1;
                    i2 = i3;
                    pruVar = pruVar2;
                    while (i4 < size) {
                        pru pruVar3 = (pru) arrayList2.get(i4);
                        j2 = j5;
                        long j9 = pruVar3.b;
                        if (j9 > j7) {
                            break;
                        }
                        if (j9 > j4) {
                            j7 = j9;
                        }
                        if (j9 <= j4 && pruVar3.c >= j7) {
                            String valueOf2 = String.valueOf(String.valueOf(sb2).concat("\n"));
                            String valueOf3 = String.valueOf(pruVar3.a.c);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                            sb3.append(valueOf2);
                            sb3.append(valueOf3);
                            sb2 = sb3.toString();
                        }
                        i4++;
                        j5 = j2;
                    }
                } else {
                    i2 = i3;
                    pruVar = pruVar2;
                }
                j2 = j5;
                String str = sb2;
                long j10 = j7;
                arrayList3.add(new SubtitleWindowSnapshot(0, TimeUnit.MICROSECONDS.toMillis(j4), str, str, SubtitleWindowSettings.a));
                long j11 = j2;
                arrayList.add(new aity(TimeUnit.MICROSECONDS.toMillis(j4), TimeUnit.MICROSECONDS.toMillis(j10), arrayList3, this.b));
                if (j11 == j8) {
                    break;
                }
                arrayList3 = new ArrayList();
                j4 = j10;
                i3 = i2;
                pruVar2 = pruVar;
                while (j4 >= pruVar2.c) {
                    i3++;
                    if (i3 < size) {
                        pruVar2 = (pru) arrayList2.get(i3);
                        j4 = Math.max(j4, pruVar2.b);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                aittVar.a(aiua.a(this.b, j));
            } else {
                aittVar.a(arrayList);
            }
        } catch (pnr unused2) {
            aittVar2.a(aiua.a(null, j));
        }
    }
}
