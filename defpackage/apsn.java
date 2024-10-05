package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apsn extends aonm implements aooz {
    public static final apsn a;
    private static volatile aopf d;
    public int b;
    public apsl c;
    private aplj e;
    private arfo f;
    private byte g = 2;

    static {
        apsn apsnVar = new apsn();
        a = apsnVar;
        aonm.registerDefaultInstance(apsn.class, apsnVar);
    }

    private apsn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf2a1♋\uef42ぉ\u0003\u0000\u0000\u0003\uf2a1♋ᐉ\u0000\ue264⩝ᐉ\u0001\uef42ぉᐉ\u0002", new Object[]{"b", "e", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new apsn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apsn.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
