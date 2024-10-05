package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgm extends aonh implements aoni {
    public static final asgm a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aulq e;
    private aota f;
    private aulq g;
    private byte h = 2;

    static {
        asgm asgmVar = new asgm();
        a = asgmVar;
        aonm.registerDefaultInstance(asgm.class, asgmVar);
    }

    private asgm() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\b \u0004\u0000\u0000\u0004\bᐉ\u0006\u0012ᐉ\f\u001eᐉ\n ᐉ\u0015", new Object[]{"c", "d", "f", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asgm();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asgm.class) {
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
