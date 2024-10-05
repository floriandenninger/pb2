package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class hon implements amml {
    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axdy axdyVar;
        axdi axdiVar = (axdi) obj;
        aone createBuilder = aqqt.a.createBuilder();
        if (axdiVar.c == 1 && awxt.b(1) == 2) {
            amml ammlVar = hpc.a;
            if (axdiVar.c == 1) {
                axdyVar = (axdy) axdiVar.d;
            } else {
                axdyVar = axdy.a;
            }
            Object apply = ammlVar.apply(axdyVar);
            createBuilder.copyOnWrite();
            aqqt aqqtVar = (aqqt) createBuilder.instance;
            apply.getClass();
            aqqtVar.c = apply;
            aqqtVar.b = 1;
        }
        return (aqqt) createBuilder.build();
    }
}
