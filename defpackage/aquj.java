package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aquj extends aonm implements aooz {
    public static final aquj a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aquk e;
    private aqui f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aota j;
    private byte k = 2;

    static {
        aquj aqujVar = new aquj();
        a = aqujVar;
        aonm.registerDefaultInstance(aquj.class, aqujVar);
    }

    private aquj() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0005\u000b\u0007\u0000\u0000\u0007\u0005ᐉ\t\u0006ᐉ\u0003\u0007ᐉ\u0005\bᐉ\u0006\tᐉ\u0004\nᐉ\u0007\u000bᐉ\u0002", new Object[]{"c", "j", "e", "g", "h", "f", "i", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aquj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aquj.class) {
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
