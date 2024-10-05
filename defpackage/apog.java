package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apog extends aonm implements aooz {
    public static final apog a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aulq e;
    private aulq f;
    private byte g = 2;

    static {
        apog apogVar = new apog();
        a = apogVar;
        aonm.registerDefaultInstance(apog.class, apogVar);
    }

    private apog() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0002\u0002ᐉ\u0003\u0003ᐉ\u0000", new Object[]{"c", "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apog();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apog.class) {
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
