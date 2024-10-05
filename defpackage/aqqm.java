package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqm extends aonm implements aooz {
    public static final aqqm a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public aulq d;
    private aulq f;
    private byte g = 2;

    static {
        aqqm aqqmVar = new aqqm();
        a = aqqmVar;
        aonm.registerDefaultInstance(aqqm.class, aqqmVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aqqmVar, aqqmVar, null, 253749840, aoqn.MESSAGE, aqqm.class);
    }

    private aqqm() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqqm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqqm.class) {
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
