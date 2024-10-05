package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aawr implements aawu {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aawr b = new aawr(1);
    public static final /* synthetic */ aawr a = new aawr(0);

    private /* synthetic */ aawr(int i) {
        this.c = i;
    }

    @Override // defpackage.aawu
    public final apxf a(apxf apxfVar, arqe arqeVar) {
        if (this.c == 0) {
            aawu aawuVar = aaww.a;
            return apxfVar;
        }
        if (!apxfVar.pY(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)) {
            return apxfVar;
        }
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apxfVar.pX(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
        aulz aulzVar = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
        if (aulzVar == null) {
            aulzVar = aulz.a;
        }
        if ((aulzVar.b & 1) == 0) {
            return apxfVar;
        }
        arpw arpwVar = null;
        if (arqeVar.c.size() > 0 && (((arqb) arqeVar.c.get(0)).b & 2) != 0) {
            arqc arqcVar = ((arqb) arqeVar.c.get(0)).d;
            if (arqcVar == null) {
                arqcVar = arqc.a;
            }
            if (arqcVar.b == 106646784) {
                arpwVar = (arpw) arqcVar.c;
            } else {
                arpwVar = arpw.a;
            }
        }
        if (arpwVar == null) {
            return apxfVar;
        }
        aulz aulzVar2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
        if (aulzVar2 == null) {
            aulzVar2 = aulz.a;
        }
        atnz atnzVar = aulzVar2.c;
        if (atnzVar == null) {
            atnzVar = atnz.a;
        }
        aong aongVar = (aong) atnzVar.toBuilder();
        aongVar.e(atny.b, arpwVar);
        atnz atnzVar2 = (atnz) aongVar.build();
        aong aongVar2 = (aong) apxf.a.createBuilder();
        aonk aonkVar = ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction;
        aone builder = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.toBuilder();
        aulz aulzVar3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
        if (aulzVar3 == null) {
            aulzVar3 = aulz.a;
        }
        aone builder2 = aulzVar3.toBuilder();
        builder2.copyOnWrite();
        aulz aulzVar4 = (aulz) builder2.instance;
        atnzVar2.getClass();
        aulzVar4.c = atnzVar2;
        aulzVar4.b |= 1;
        builder.copyOnWrite();
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) builder.instance;
        aulz aulzVar5 = (aulz) builder2.build();
        aulzVar5.getClass();
        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.c = aulzVar5;
        replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.b |= 1;
        aongVar2.e(aonkVar, (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) builder.build());
        return (apxf) aongVar2.build();
    }
}
