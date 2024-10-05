package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoos {
    public final aoor a;

    private aoos(aoqn aoqnVar, Object obj, aoqn aoqnVar2, Object obj2) {
        this.a = new aoor(aoqnVar, obj, aoqnVar2, obj2);
    }

    public static int a(aoor aoorVar, Object obj, Object obj2) {
        return aomz.a(aoorVar.a, 1, obj) + aomz.a(aoorVar.c, 2, obj2);
    }

    public static aoos b(aoqn aoqnVar, Object obj, aoqn aoqnVar2, Object obj2) {
        return new aoos(aoqnVar, obj, aoqnVar2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(aomp aompVar, aoor aoorVar, Object obj, Object obj2) {
        aomz.h(aompVar, aoorVar.a, 1, obj);
        aomz.h(aompVar, aoorVar.c, 2, obj2);
    }
}
