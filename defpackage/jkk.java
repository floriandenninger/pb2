package defpackage;

import android.content.DialogInterface;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jkk implements DialogInterface.OnClickListener {
    public final /* synthetic */ jkv a;
    private final /* synthetic */ int b;

    public /* synthetic */ jkk(jkv jkvVar, int i) {
        this.b = i;
        this.a = jkvVar;
    }

    public jkk(jkv jkvVar, int i, byte[] bArr) {
        this.b = i;
        this.a = jkvVar;
    }

    public jkk(jkv jkvVar, int i, char[] cArr) {
        this.b = i;
        this.a = jkvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Boolean bool;
        int i2 = this.b;
        if (i2 == 0) {
            agzn agznVar = this.a.p;
            if (agznVar != null) {
                agznVar.a();
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                agzn agznVar2 = this.a.o;
                if (agznVar2 != null) {
                    agznVar2.a();
                    return;
                }
                return;
            }
            agxm agxmVar = this.a.r;
            if (agxmVar != null) {
                agxmVar.b.d().o(agxmVar.a);
                agxmVar.b.c(R.string.sync_playlist_start);
                return;
            }
            return;
        }
        agxm agxmVar2 = this.a.s;
        if (agxmVar2 != null) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                agxmVar2.b.h(agxmVar2.a);
                return;
            }
            if (!agxmVar2.b.b.o()) {
                agxmVar2.b.c.b();
                return;
            }
            agxo agxoVar = agxmVar2.b;
            agya agyaVar = agxoVar.e;
            String str = agxmVar2.a;
            long b = agxoVar.d.b();
            if (agyaVar.a.m()) {
                aqvj aqvjVar = agyaVar.a.d.b.b().C;
                if (aqvjVar == null) {
                    aqvjVar = aqvj.a;
                }
                if (aqvjVar.a(45358948L)) {
                    aoot aootVar = aqvjVar.b;
                    if (!aootVar.containsKey(45358948L)) {
                        throw new IllegalArgumentException();
                    }
                    aqvk aqvkVar = (aqvk) aootVar.get(45358948L);
                    bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                bool.booleanValue();
            }
            if (agyaVar.b.a().i().B(str, b)) {
                agxmVar2.b.c(R.string.sync_playlist_start);
            }
        }
    }
}
