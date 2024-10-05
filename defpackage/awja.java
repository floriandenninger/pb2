package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awja implements aala {
    public static final aalb a = new awiz();
    public final aakv b;
    public final awjc c;

    public awja(awjc awjcVar, aakv aakvVar) {
        this.c = awjcVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        avgg avggVar;
        amsv amsvVar = new amsv();
        awjc awjcVar = this.c;
        if ((awjcVar.c & 8) != 0) {
            amsvVar.c(awjcVar.f);
        }
        if (this.c.l.size() > 0) {
            amsvVar.j(this.c.l);
        }
        if (this.c.m.size() > 0) {
            amsvVar.j(this.c.m);
        }
        amsvVar.j(getDescriptionModel().a());
        amsvVar.j(getFormattedDescriptionModel().a());
        amsvVar.j(getThumbnailModel().a());
        for (auct auctVar : getThumbnailStyleDataMap().values()) {
            amsv amsvVar2 = new amsv();
            aucv aucvVar = auctVar.b;
            if (aucvVar.b == 1) {
                avggVar = (avgg) aucvVar.c;
            } else {
                avggVar = avgg.a;
            }
            amsvVar2.j(avgj.b(avggVar).b(auctVar.a).a());
            aucs a2 = auctVar.a();
            amsv amsvVar3 = new amsv();
            avgg avggVar2 = a2.b.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            amsvVar3.j(avgj.b(avggVar2).b(a2.a).a());
            amsvVar2.j(amsvVar3.g());
            amsvVar.j(amsvVar2.g());
        }
        return amsvVar.g();
    }

    public final amru b() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.l.iterator();
        while (it.hasNext()) {
            aakt b = this.b.b((String) it.next());
            if (b != null) {
                if (b instanceof awji) {
                    amrpVar.h((awji) b);
                } else {
                    String valueOf = String.valueOf(b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Entity ");
                    sb.append(valueOf);
                    sb.append(" is not a YtMainPlaylistVideoEntityModel");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return amrpVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new awiy(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awja) && this.c.equals(((awja) obj).c);
    }

    public final List f() {
        return this.c.l;
    }

    public awnd getDescription() {
        awnd awndVar = this.c.h;
        return awndVar == null ? awnd.a : awndVar;
    }

    public awmv getDescriptionModel() {
        awnd awndVar = this.c.h;
        if (awndVar == null) {
            awndVar = awnd.a;
        }
        return awmv.b(awndVar).c(this.b);
    }

    public aqyg getFormattedDescription() {
        aqyg aqygVar = this.c.i;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getFormattedDescriptionModel() {
        aqyg aqygVar = this.c.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.b);
    }

    public String getPlaylistId() {
        return this.c.e;
    }

    public avgg getThumbnail() {
        avgg avggVar = this.c.k;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getThumbnailModel() {
        avgg avggVar = this.c.k;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.b);
    }

    public Map getThumbnailStyleDataMap() {
        return amkq.aM(Collections.unmodifiableMap(this.c.n), new amml() { // from class: awix
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                awja awjaVar = awja.this;
                aone builder = ((aucv) obj).toBuilder();
                return new auct((aucv) builder.build(), awjaVar.b);
            }
        });
    }

    public String getTitle() {
        return this.c.g;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public awje getVisibility() {
        awje b = awje.b(this.c.j);
        return b == null ? awje.PLAYLIST_VISIBILITY_UNKNOWN : b;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("YtMainPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
