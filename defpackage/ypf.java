package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ypf implements yoy {
    @Override // defpackage.yoy
    public final ypc[] a(Object obj, Class cls, Object obj2) {
        if (!(obj instanceof ypd)) {
            return null;
        }
        ypd ypdVar = (ypd) obj;
        Class[] kz = ypdVar.kz(cls, null, -1);
        if (kz != null) {
            ype ypeVar = new ype(ypdVar, cls, kz);
            ypc[] ypcVarArr = new ypc[kz.length];
            for (int i = 0; i < kz.length; i++) {
                ypcVarArr[i] = new ypc(obj, kz[i], obj2, ypeVar);
            }
            return ypcVarArr;
        }
        throw new IllegalArgumentException(String.format("Class %s does not contain any injected methods annotated with @Subscribe", cls.getSimpleName()));
    }
}
