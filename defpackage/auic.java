package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auic extends aonm implements aooz {
    public static final auic a;
    private static volatile aopf i;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int j;

    static {
        auic auicVar = new auic();
        a = auicVar;
        aonm.registerDefaultInstance(auic.class, auicVar);
    }

    private auic() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006င\u0005\u0007င\u0006\tဌ\b", new Object[]{"j", "b", "c", "d", "e", aufb.m, "f", "g", "h", aufb.n});
            case NEW_MUTABLE_INSTANCE:
                return new auic();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (auic.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
