package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opn {

    @Backup
    public static final String PIVOT_BAR_ACCOUNT_HINT_SHOWN = "pivot_bar_account_hint_shown";

    @Backup
    public static final String PIVOT_BAR_LIBRARY_HINT_TIMESTAMP = "pivot_bar_library_hint_timestamp";

    @Backup
    public static final String PIVOT_BAR_LIBRARY_TAB_VISITED = "pivot_bar_library_tab_visited";

    @Backup
    public static final String PIVOT_BAR_TAP_COUNT = "pivot_bar_tap_count";

    public static final void a(a aVar, View view, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ColorStateList colorStateList) {
        textView.setText(aVar.b);
        textView.setTextColor(colorStateList);
        Drawable drawable = aVar.d;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        String str = aVar.e;
        if (str == null) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            textView2.setText(str);
            textView2.setVisibility(0);
            aVar.e.getClass();
            if (!aVar.c) {
                textView3.setText("•");
                textView3.setVisibility(0);
            }
        }
        CharSequence charSequence = aVar.f;
        if (charSequence != null) {
            view.setContentDescription(charSequence);
        }
    }

    public static final e b(int i, List list, AdapterView.OnItemClickListener onItemClickListener, Context context, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.embed_bottom_sheet_list, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.bottom_sheet_title);
        if (i == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(i);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        f fVar = new f(context);
        fVar.addAll(list);
        listView.setAdapter((ListAdapter) fVar);
        listView.setOnItemClickListener(onItemClickListener);
        listView.setOnTouchListener(new gpm(4));
        e eVar = new e(context);
        eVar.e();
        eVar.a = new b(eVar);
        eVar.setOnShowListener(onShowListener);
        eVar.setOnDismissListener(onDismissListener);
        eVar.setContentView(inflate);
        return eVar;
    }

    public static apxf c(String str, int i, long j) {
        if (str == null) {
            return null;
        }
        aong aongVar = (aong) u(j).toBuilder();
        aone builder = ((awdp) aongVar.pX(WatchEndpointOuterClass.watchEndpoint)).toBuilder();
        builder.copyOnWrite();
        awdp awdpVar = (awdp) builder.instance;
        awdpVar.b |= 2;
        awdpVar.e = str;
        builder.copyOnWrite();
        awdp awdpVar2 = (awdp) builder.instance;
        awdpVar2.b |= 4;
        awdpVar2.f = i;
        aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) builder.build());
        return (apxf) aongVar.build();
    }

    public static apxf d(String str, long j) {
        if (str == null) {
            return null;
        }
        aong aongVar = (aong) u(j).toBuilder();
        aone builder = ((awdp) aongVar.pX(WatchEndpointOuterClass.watchEndpoint)).toBuilder();
        builder.copyOnWrite();
        awdp awdpVar = (awdp) builder.instance;
        awdpVar.b |= 1;
        awdpVar.d = str;
        aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) builder.build());
        return (apxf) aongVar.build();
    }

    public static Optional e(List list, int i, long j) {
        if (list == null || list.isEmpty()) {
            alta.B("Malformed parameters. Video list cannot be empty", new Object[0]);
            return Optional.empty();
        }
        return Optional.ofNullable(d((String) list.get(Math.min(list.size() - 1, Math.max(0, i))), j));
    }

    public static Optional f(SimplePlaybackDescriptor simplePlaybackDescriptor) {
        int i = simplePlaybackDescriptor.a;
        if (i == 1) {
            return Optional.ofNullable(d(simplePlaybackDescriptor.b, simplePlaybackDescriptor.g));
        }
        if (i == 2) {
            return Optional.ofNullable(c(simplePlaybackDescriptor.c, simplePlaybackDescriptor.f, simplePlaybackDescriptor.g));
        }
        if (i == 3) {
            return e(simplePlaybackDescriptor.d, simplePlaybackDescriptor.f, simplePlaybackDescriptor.g);
        }
        alta.B("Malformed description, cannot create navigationEndPoint.", new Object[0]);
        return Optional.empty();
    }

    public static Object h(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void l(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void m(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
    }

    public static pfc n(pbw pbwVar) {
        pgx pgxVar = new pgx(16);
        if (aeqp.d(pbwVar, pgxVar).b != pgz.c("RIFF")) {
            return null;
        }
        pbwVar.g(pgxVar.a, 0, 4);
        pgxVar.z(0);
        int c = pgxVar.c();
        if (c != pgz.c("WAVE")) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(c);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        aeqp d = aeqp.d(pbwVar, pgxVar);
        while (d.b != pgz.c("fmt ")) {
            pbwVar.e((int) d.a);
            d = aeqp.d(pbwVar, pgxVar);
        }
        k(d.a >= 16);
        pbwVar.g(pgxVar.a, 0, 16);
        pgxVar.z(0);
        int f = pgxVar.f();
        int f2 = pgxVar.f();
        int e = pgxVar.e();
        int e2 = pgxVar.e();
        int f3 = pgxVar.f();
        int f4 = pgxVar.f();
        int i = (f2 * f4) / 8;
        if (f3 == i) {
            int d2 = pgz.d(f4);
            if (d2 == 0) {
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unsupported WAV bit depth: ");
                sb2.append(f4);
                Log.e("WavHeaderReader", sb2.toString());
                return null;
            }
            if (f == 1 || f == 65534) {
                pbwVar.e(((int) d.a) - 16);
                return new pfc(f2, e, e2, f3, f4, d2);
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Unsupported WAV format type: ");
            sb3.append(f);
            Log.e("WavHeaderReader", sb3.toString());
            return null;
        }
        StringBuilder sb4 = new StringBuilder(55);
        sb4.append("Expected block alignment: ");
        sb4.append(i);
        sb4.append("; got: ");
        sb4.append(f3);
        throw new oyo(sb4.toString());
    }

    public static int o(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static boolean p(int i, pgx pgxVar, boolean z) {
        if (pgxVar.h() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new oyo(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        }
        if (pgxVar.h() == 118 && pgxVar.h() == 111 && pgxVar.h() == 114 && pgxVar.h() == 98 && pgxVar.h() == 105 && pgxVar.h() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new oyo("expected characters 'vorbis'");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.UUID q(byte[] r9) {
        /*
            pgx r0 = new pgx
            r0.<init>(r9)
            int r9 = r0.c
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto Le
        Lc:
            r9 = r1
            goto L78
        Le:
            r9 = 0
            r0.z(r9)
            int r2 = r0.c()
            int r3 = r0.a()
            int r3 = r3 + 4
            if (r2 == r3) goto L1f
            goto Lc
        L1f:
            int r2 = r0.c()
            int r3 = defpackage.pdc.X
            if (r2 == r3) goto L28
            goto Lc
        L28:
            int r2 = r0.c()
            int r2 = defpackage.pdc.f(r2)
            r3 = 1
            if (r2 <= r3) goto L4c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 37
            r9.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto Lc
        L4c:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.m()
            long r7 = r0.m()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L64
            int r2 = r0.j()
            int r2 = r2 * 16
            r0.A(r2)
        L64:
            int r2 = r0.j()
            int r3 = r0.a()
            if (r2 == r3) goto L6f
            goto Lc
        L6f:
            byte[] r3 = new byte[r2]
            r0.u(r3, r9, r2)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L78:
            if (r9 != 0) goto L7b
            return r1
        L7b:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opn.q(byte[]):java.util.UUID");
    }

    public static oxk r(int i, int i2, int i3) {
        return new oxm(i, i2, i3);
    }

    public static oxk s() {
        return new oxm(1, 2500, 5000);
    }

    public static int t(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    private static apxf u(long j) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = awdp.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        createBuilder.copyOnWrite();
        awdp awdpVar = (awdp) createBuilder.instance;
        awdpVar.b |= 128;
        awdpVar.j = (float) seconds;
        aongVar.e(WatchEndpointOuterClass.watchEndpoint, (awdp) createBuilder.build());
        return (apxf) aongVar.build();
    }

    public static Optional g(Context context) {
        for (int i = 0; i < 10; i++) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    return Optional.of((Activity) context);
                }
            } else {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}
