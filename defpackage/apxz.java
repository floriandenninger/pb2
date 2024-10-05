package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxz implements aala {
    public static final aalb a = new apxy();
    public final apya b;
    private final aakv c;

    public apxz(apya apyaVar, aakv aakvVar) {
        this.b = apyaVar;
        this.c = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amxe it = ((amru) getMentionRunsModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(new amsv().g());
        }
        amxe it2 = ((amru) getEmojiRunsModels()).iterator();
        while (it2.hasNext()) {
            awtr awtrVar = (awtr) it2.next();
            amsv amsvVar2 = new amsv();
            aqss aqssVar = awtrVar.b.e;
            if (aqssVar == null) {
                aqssVar = aqss.a;
            }
            amsvVar2.j(aqsr.b(aqssVar).k(awtrVar.a).a());
            amsvVar.j(amsvVar2.g());
        }
        amsvVar.j(getZeroStepSuccessCommandModel().a());
        amsvVar.j(getZeroStepFailureCommandModel().a());
        amsvVar.j(getShowCommentComposerDialogModel().a());
        amsvVar.j(getDismissDialogCommandModel().a());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final apxx e() {
        return new apxx(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof apxz) && this.b.equals(((apxz) obj).b);
    }

    public String getChannelCreationToken() {
        return this.b.l;
    }

    public String getCommentText() {
        return this.b.d;
    }

    public String getCreateCommentParams() {
        return this.b.h;
    }

    public apxf getDismissDialogCommand() {
        apxf apxfVar = this.b.t;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getDismissDialogCommandModel() {
        apxf apxfVar = this.b.t;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.c);
    }

    public List getEmojiRuns() {
        return this.b.g;
    }

    public List getEmojiRunsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.g.iterator();
        while (it.hasNext()) {
            aone builder = ((awts) it.next()).toBuilder();
            amrpVar.h(new awtr((awts) builder.build(), this.c));
        }
        return amrpVar.g();
    }

    public Boolean getIsEditing() {
        return Boolean.valueOf(this.b.p);
    }

    public Boolean getIsFocused() {
        return Boolean.valueOf(this.b.q);
    }

    public Boolean getIsHidden() {
        return Boolean.valueOf(this.b.s);
    }

    public List getMentionRuns() {
        return this.b.f;
    }

    public List getMentionRunsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.f.iterator();
        while (it.hasNext()) {
            amrpVar.h(new awtw((awtx) ((awtx) it.next()).toBuilder().build()));
        }
        return amrpVar.g();
    }

    public String getReplyCaptionText() {
        return this.b.n;
    }

    public Boolean getShouldDisplayStoredText() {
        return Boolean.valueOf(this.b.m);
    }

    public Boolean getShouldHideComposer() {
        return Boolean.valueOf(this.b.r);
    }

    public apxf getShowCommentComposerDialog() {
        apxf apxfVar = this.b.o;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getShowCommentComposerDialogModel() {
        apxf apxfVar = this.b.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.c);
    }

    public Boolean getShowZeroStep() {
        return Boolean.valueOf(this.b.i);
    }

    public String getShownText() {
        return this.b.e;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public apxf getZeroStepFailureCommand() {
        apxf apxfVar = this.b.k;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getZeroStepFailureCommandModel() {
        apxf apxfVar = this.b.k;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.c);
    }

    public apxf getZeroStepSuccessCommand() {
        apxf apxfVar = this.b.j;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getZeroStepSuccessCommandModel() {
        apxf apxfVar = this.b.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.c);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("CommentComposerTextStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
