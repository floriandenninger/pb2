package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfw extends aonm implements aooz {
    public static final asfw a;
    private static volatile aopf i;
    public int b;
    public arnd c;
    public asfo d;
    public asgd e;
    public aomf g;
    public int h;
    private armb j;
    private aota k;
    private aqzg l;
    private byte m = 2;
    public aony f = emptyProtobufList();

    static {
        asfw asfwVar = new asfw();
        a = asfwVar;
        aonm.registerDefaultInstance(asfw.class, asfwVar);
    }

    private asfw() {
        aonm.emptyProtobufList();
        this.g = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007Л\bᐉ\u0005\nဌ\u0006̉ᐉ\u0007", new Object[]{"b", "c", "d", "j", "e", "g", "f", apxf.class, "k", "h", aweb.l, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asfw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (asfw.class) {
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
