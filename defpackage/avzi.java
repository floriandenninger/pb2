package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzi extends aonm implements aooz {
    public static final avzi a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private avzk f;
    private avzj g;
    private apxf h;
    private aulq i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aota o;
    private byte p = 2;

    static {
        avzi avziVar = new avzi();
        a = avziVar;
        aonm.registerDefaultInstance(avzi.class, avziVar);
    }

    private avzi() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0010\bᐉ\u0004\tᐉ\u0005\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b\u0013ᐉ\u000f\u0014ᐉ\f", new Object[]{"c", "d", "e", "f", "g", "o", "h", "i", "j", "k", "l", "n", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new avzi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avzi.class) {
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
