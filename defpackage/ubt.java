package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubt {
    public final Context a;
    public final ubw b;
    public final ubo c;
    public final two d;
    private final tzl e;
    private final axpg f;
    private final tzh g;

    public ubt(Context context, twn twnVar, tzl tzlVar, ubw ubwVar, axpg axpgVar, ubo uboVar, tzh tzhVar) {
        this.a = context;
        this.e = tzlVar;
        this.b = ubwVar;
        this.f = axpgVar;
        this.c = uboVar;
        this.g = tzhVar;
        this.d = twnVar.d;
    }

    public static List d(List list, twd twdVar) {
        ArrayList arrayList = new ArrayList();
        if (twdVar.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Bitmap bitmap = (Bitmap) ((Future) it.next()).get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException e) {
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image.", new Object[0]);
                } catch (ExecutionException e3) {
                    e = e3;
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image.", new Object[0]);
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Bitmap bitmap2 = (Bitmap) ((Future) it2.next()).get(twdVar.a(), TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException e4) {
                    tzk.c("NotificationBuilderHelper", e4, "Failed to download image, remaining time: %d ms.", Long.valueOf(twdVar.a()));
                    Thread.currentThread().interrupt();
                } catch (CancellationException e5) {
                    e = e5;
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(twdVar.a()));
                } catch (ExecutionException e6) {
                    e = e6;
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(twdVar.a()));
                } catch (TimeoutException e7) {
                    e = e7;
                    tzk.c("NotificationBuilderHelper", e, "Failed to download image, remaining time: %d ms.", Long.valueOf(twdVar.a()));
                }
            }
        }
        return arrayList;
    }

    public static int g(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : -2;
        }
        return 2;
    }

    private final Bitmap i(aokd aokdVar, List list) {
        if (list.isEmpty()) {
            return null;
        }
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
        int C = aobq.C(aokdVar.s);
        if (C == 0) {
            C = 1;
        }
        if (C - 1 != 2) {
            return this.e.a(dimensionPixelSize, list);
        }
        return this.e.b(dimensionPixelSize, list);
    }

    private static final CharSequence j(String str) {
        return axsm.b() ? gn.i(str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(java.lang.String r19, defpackage.twu r20, defpackage.txb r21, boolean r22, defpackage.twd r23, defpackage.ucx r24) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubt.a(java.lang.String, twu, txb, boolean, twd, ucx):android.util.Pair");
    }

    public final CharSequence b(int i, String... strArr) {
        if (!axsm.b()) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = Html.escapeHtml(strArr[i2]);
            }
        }
        return gn.i(this.a.getString(i, strArr));
    }

    public final String c(twu twuVar, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            aokd aokdVar = ((txb) it.next()).d;
            if ((aokdVar.b & 131072) != 0) {
                hashSet.add(aokdVar.u);
            } else {
                i++;
            }
        }
        if (hashSet.size() != 1 || i != 0) {
            if (twuVar == null || !this.d.g) {
                return null;
            }
            return twuVar.b;
        }
        return (String) hashSet.iterator().next();
    }

    public final void e(dy dyVar, twu twuVar, int i) {
        String string = this.a.getString(this.d.b.intValue());
        String quantityString = this.a.getResources().getQuantityString(R.plurals.public_notification_text, i, Integer.valueOf(i));
        dy dyVar2 = new dy(this.a);
        dyVar2.k(string);
        dyVar2.j(quantityString);
        dyVar2.r(this.d.a.intValue());
        if (twuVar != null) {
            dyVar2.t(twuVar.b);
        }
        if (this.d.c != null) {
            dyVar2.z = this.a.getResources().getColor(this.d.c.intValue());
        }
        dyVar.B = dyVar2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.dy r3, defpackage.aokd r4, boolean r5) {
        /*
            r2 = this;
            if (r5 != 0) goto L14
            two r0 = r2.d
            boolean r0 = r0.e
            if (r0 == 0) goto L14
            aokb r0 = r4.k
            if (r0 != 0) goto Le
            aokb r0 = defpackage.aokb.a
        Le:
            boolean r0 = r0.c
            if (r0 != 0) goto L14
            r0 = 2
            goto L19
        L14:
            r0 = 0
            r3.v(r0)
            r0 = 0
        L19:
            if (r5 != 0) goto L2d
            two r1 = r2.d
            boolean r1 = r1.d
            if (r1 == 0) goto L2d
            aokb r1 = r4.k
            if (r1 != 0) goto L27
            aokb r1 = defpackage.aokb.a
        L27:
            boolean r1 = r1.d
            if (r1 != 0) goto L2d
            r0 = r0 | 1
        L2d:
            if (r5 != 0) goto L41
            two r5 = r2.d
            boolean r5 = r5.f
            if (r5 == 0) goto L41
            aokb r4 = r4.k
            if (r4 != 0) goto L3b
            aokb r4 = defpackage.aokb.a
        L3b:
            boolean r4 = r4.e
            if (r4 != 0) goto L41
            r0 = r0 | 4
        L41:
            r3.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubt.f(dy, aokd, boolean):void");
    }

    public final List h(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoki aokiVar = (aoki) it.next();
            if (!aokiVar.b.isEmpty() || !aokiVar.c.isEmpty()) {
                tzn tznVar = (tzn) this.f.get();
                String str = aokiVar.b;
                String str2 = aokiVar.c;
                arrayList.add(tznVar.a(str, i, i2));
                if (arrayList.size() >= 4) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
