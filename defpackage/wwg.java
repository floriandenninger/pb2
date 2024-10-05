package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wwg implements wof, wwy {
    public PlayerResponseModel b;
    public final azrw c;
    private aign f;
    private final azrw g;
    final List e = new ArrayList();
    public final List d = new ArrayList();
    public String a = "";

    public wwg(azrw azrwVar, azrw azrwVar2) {
        this.c = azrwVar;
        this.g = azrwVar2;
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        this.a = str;
        this.f = aignVar;
        this.b = playerResponseModel;
        if (aignVar == aign.NEW) {
            this.d.clear();
            this.e.clear();
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wwy
    public final void i(xgh xghVar) {
        ArrayList arrayList = new ArrayList(this.d.size());
        arrayList.addAll(this.d);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wwf wwfVar = (wwf) arrayList.get(i);
            if (xghVar == null) {
                whu.l(null, "Provided onSlotUnscheduled() param was null");
            } else if (wwfVar == null) {
                whu.l(null, "Slot bundle was null");
            } else if (TextUtils.equals(wwfVar.a.a, xghVar.a)) {
                this.e.add(wwfVar);
                this.d.remove(wwfVar);
            }
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        if (this.f == aign.VIDEO_PLAYING && !this.e.isEmpty() && TextUtils.equals(this.a, str)) {
            ArrayList arrayList = new ArrayList(this.e.size());
            arrayList.addAll(this.e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final wwf wwfVar = (wwf) arrayList.get(i);
                if (wwfVar.d) {
                    if (!wwfVar.b.a(j)) {
                        this.e.remove(wwfVar);
                        ((ajoy) this.g.get()).w(10, wwfVar.c, new wwc() { // from class: wwe
                            @Override // defpackage.wwc
                            public final List a() {
                                return Arrays.asList(wwf.this.a);
                            }
                        });
                    }
                } else if (wwfVar.b.a(j)) {
                    wwfVar.d = true;
                }
            }
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
