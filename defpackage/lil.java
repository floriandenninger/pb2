package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lil {
    public final fuu a;
    public final String b;
    private final ScheduledExecutorService c;
    private final agcm d;

    public lil(fuu fuuVar, agcm agcmVar, ScheduledExecutorService scheduledExecutorService, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = fuuVar;
        this.d = agcmVar;
        this.c = scheduledExecutorService;
        this.b = str;
    }

    public final anhy a() {
        akne b;
        fuu fuuVar = this.a;
        if (fuuVar.b.t()) {
            b = akne.a(fuuVar.b.c().d(), "search_namespace", "voice_language");
        } else {
            b = akne.b("search_namespace", "voice_language");
        }
        final int i = 0;
        final int i2 = 1;
        anhy i3 = aney.i(anfq.i(anht.q(fuuVar.a.a(b, aeoi.b)), new anfz(this) { // from class: lik
            public final /* synthetic */ lil a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    auqe auqeVar = (auqe) obj;
                    this.a.a.b();
                    if (auqeVar != null) {
                        return anaf.O(auqeVar);
                    }
                    return anaf.N(new Exception("Cached voice language renderer is null"));
                }
                if (i4 == 1) {
                    this.a.a.b();
                    return anaf.N(new aknf("Voice language renderer not found in cache"));
                }
                lil lilVar = this.a;
                String str = (String) obj;
                if (str.isEmpty()) {
                    return anaf.O(lilVar.b);
                }
                return anaf.O(str);
            }
        }, this.c), aknf.class, new anfz(this) { // from class: lik
            public final /* synthetic */ lil a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    auqe auqeVar = (auqe) obj;
                    this.a.a.b();
                    if (auqeVar != null) {
                        return anaf.O(auqeVar);
                    }
                    return anaf.N(new Exception("Cached voice language renderer is null"));
                }
                if (i4 == 1) {
                    this.a.a.b();
                    return anaf.N(new aknf("Voice language renderer not found in cache"));
                }
                lil lilVar = this.a;
                String str = (String) obj;
                if (str.isEmpty()) {
                    return anaf.O(lilVar.b);
                }
                return anaf.O(str);
            }
        }, angq.a);
        final int i4 = 2;
        anhy i5 = anfq.i(this.d.k(), new anfz(this) { // from class: lik
            public final /* synthetic */ lil a;

            {
                this.a = this;
            }

            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                int i42 = i4;
                if (i42 == 0) {
                    auqe auqeVar = (auqe) obj;
                    this.a.a.b();
                    if (auqeVar != null) {
                        return anaf.O(auqeVar);
                    }
                    return anaf.N(new Exception("Cached voice language renderer is null"));
                }
                if (i42 == 1) {
                    this.a.a.b();
                    return anaf.N(new aknf("Voice language renderer not found in cache"));
                }
                lil lilVar = this.a;
                String str = (String) obj;
                if (str.isEmpty()) {
                    return anaf.O(lilVar.b);
                }
                return anaf.O(str);
            }
        }, this.c);
        return anaf.I(i5, i3).b(new abes(i5, i3, 1), angq.a);
    }
}
