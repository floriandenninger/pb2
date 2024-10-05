package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbw extends aonm implements aooz {
    public static final arbw a;
    private static volatile aopf b;
    private int c;
    private avso d;
    private avvp e;
    private byte f = 2;

    static {
        arbw arbwVar = new arbw();
        a = arbwVar;
        aonm.registerDefaultInstance(arbw.class, arbwVar);
    }

    private arbw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001︿Ḗ\ue70c㔱\u0002\u0000\u0000\u0002︿Ḗᐉ\u0001\ue70c㔱ᐉ\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arbw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arbw.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
