package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kav implements kbj {
    private final Context a;
    private final jni b;
    private final ammv c;
    private final /* synthetic */ int d;

    public kav(Context context, jni jniVar, ammv ammvVar, int i) {
        this.d = i;
        this.a = context;
        this.b = jniVar;
        this.c = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        int i = this.d;
        if (i == 0) {
            aone createBuilder = aqoa.a.createBuilder();
            String string = this.a.getString(R.string.smart_downloads_title);
            createBuilder.copyOnWrite();
            aqoa aqoaVar = (aqoa) createBuilder.instance;
            string.getClass();
            aqoaVar.c |= 4;
            aqoaVar.d = string;
            if (this.c.h()) {
                if (((kbk) this.c.c()).a > 0) {
                    int days = (int) TimeUnit.MILLISECONDS.toDays(((kbk) this.c.c()).b);
                    if (days == 0) {
                        String string2 = this.a.getString(R.string.smart_downloads_last_updated_today_text);
                        createBuilder.copyOnWrite();
                        aqoa aqoaVar2 = (aqoa) createBuilder.instance;
                        string2.getClass();
                        aqoaVar2.c |= 8;
                        aqoaVar2.e = string2;
                    } else {
                        String quantityString = this.a.getResources().getQuantityString(R.plurals.smart_downloads_last_updated_text, days, Integer.valueOf(days));
                        createBuilder.copyOnWrite();
                        aqoa aqoaVar3 = (aqoa) createBuilder.instance;
                        quantityString.getClass();
                        aqoaVar3.c |= 8;
                        aqoaVar3.e = quantityString;
                    }
                }
                Context context = this.a;
                String string3 = context.getString(R.string.smart_downloads_used_storage_label, zhq.o(context.getResources(), ((kbk) this.c.c()).a).replace(" ", ""));
                createBuilder.copyOnWrite();
                aqoa aqoaVar4 = (aqoa) createBuilder.instance;
                string3.getClass();
                aqoaVar4.c |= 16;
                aqoaVar4.f = string3;
            }
            ammv b = this.b.b(R.raw.downloads_page_smart_downloads_header_element_android, aqoa.b, (aqoa) createBuilder.build());
            if (b.h()) {
                aone createBuilder2 = askb.a.createBuilder();
                aqrf aqrfVar = (aqrf) b.c();
                createBuilder2.copyOnWrite();
                askb askbVar = (askb) createBuilder2.instance;
                askbVar.i = aqrfVar;
                askbVar.b |= 64;
                return amru.r(new kbh((askb) createBuilder2.build()));
            }
            return amru.q();
        }
        if (i == 1) {
            if (!this.c.h()) {
                return amru.q();
            }
            jzx jzxVar = (jzx) this.c.c();
            jni jniVar = this.b;
            aonk aonkVar = aqne.b;
            aone createBuilder3 = aqne.a.createBuilder();
            Resources resources = this.a.getResources();
            int i2 = jzxVar.a;
            String str = ajcq.h(resources.getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i2, Integer.valueOf(i2))).d;
            createBuilder3.copyOnWrite();
            aqne aqneVar = (aqne) createBuilder3.instance;
            str.getClass();
            aqneVar.c |= 4;
            aqneVar.d = str;
            int i3 = jzxVar.b;
            createBuilder3.copyOnWrite();
            aqne aqneVar2 = (aqne) createBuilder3.instance;
            aqneVar2.e = i3 - 1;
            aqneVar2.c |= 8;
            ammv b2 = jniVar.b(R.raw.downloads_page_disclaimer_element_android, aonkVar, (aqne) createBuilder3.build());
            if (!b2.h()) {
                return amru.q();
            }
            aone createBuilder4 = askg.a.createBuilder();
            aqrf aqrfVar2 = (aqrf) b2.c();
            createBuilder4.copyOnWrite();
            askg askgVar = (askg) createBuilder4.instance;
            askgVar.av = aqrfVar2;
            askgVar.h |= 1048576;
            return amru.r(new kbh((askg) createBuilder4.build()));
        }
        int days2 = (int) TimeUnit.SECONDS.toDays(((Long) this.c.e(0L)).longValue());
        jni jniVar2 = this.b;
        aonk aonkVar2 = aqod.b;
        aone createBuilder5 = aqod.a.createBuilder();
        String quantityString2 = this.a.getResources().getQuantityString(R.plurals.smart_downloads_future_update_text, days2, Integer.valueOf(days2));
        createBuilder5.copyOnWrite();
        aqod aqodVar = (aqod) createBuilder5.instance;
        quantityString2.getClass();
        aqodVar.c |= 8;
        aqodVar.d = quantityString2;
        String d = amkq.d(this.a.getString(R.string.smart_downloads_update_button_text));
        createBuilder5.copyOnWrite();
        aqod aqodVar2 = (aqod) createBuilder5.instance;
        d.getClass();
        aqodVar2.c |= 64;
        aqodVar2.e = d;
        String d2 = amkq.d(this.a.getString(R.string.smart_downloads_opt_out_button_text));
        createBuilder5.copyOnWrite();
        aqod aqodVar3 = (aqod) createBuilder5.instance;
        d2.getClass();
        aqodVar3.c |= 128;
        aqodVar3.f = d2;
        String w = fhe.w();
        createBuilder5.copyOnWrite();
        aqod aqodVar4 = (aqod) createBuilder5.instance;
        w.getClass();
        aqodVar4.c |= 256;
        aqodVar4.g = w;
        ammv b3 = jniVar2.b(R.raw.downloads_page_smart_downloads_zero_state_element_android, aonkVar2, (aqod) createBuilder5.build());
        if (b3.h()) {
            aone createBuilder6 = askg.a.createBuilder();
            aqrf aqrfVar3 = (aqrf) b3.c();
            createBuilder6.copyOnWrite();
            askg askgVar2 = (askg) createBuilder6.instance;
            askgVar2.av = aqrfVar3;
            askgVar2.h |= 1048576;
            return amru.r(new kbh((askg) createBuilder6.build()));
        }
        return amru.q();
    }
}
