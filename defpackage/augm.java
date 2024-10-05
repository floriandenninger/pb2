package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augm extends aonm implements aooz {
    public static final augm a;
    private static volatile aopf k;
    public int b;
    public arfs c;
    public aqyg d;
    public aqyg e;
    public aulq h;
    public augx i;
    public augn j;
    private byte l = 2;
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        augm augmVar = new augm();
        a = augmVar;
        aonm.registerDefaultInstance(augm.class, augmVar);
    }

    private augm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005Л\u0006ᐉ\u0003\u0007ဉ\u0004\bဉ\u0005", new Object[]{"b", "c", "d", "e", "f", apxf.class, "g", apxf.class, "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new augm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (augm.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
