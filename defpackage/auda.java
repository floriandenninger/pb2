package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auda extends aonm implements aooz {
    public static final auda a;
    private static volatile aopf e;
    public int b;
    public audb c;
    public aucz d;
    private atlb f;
    private byte g = 2;

    static {
        auda audaVar = new auda();
        a = audaVar;
        aonm.registerDefaultInstance(auda.class, audaVar);
    }

    private auda() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue365⊉\ue69a乮\u0003\u0000\u0000\u0003\ue365⊉ᐉ\u0000\ue391⊉ᐉ\u0001\ue69a乮ᐉ\u0003", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auda();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auda.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
