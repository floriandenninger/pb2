package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avii extends aonm implements aooz {
    public static final avii a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public apmh f;
    public apmh g;
    public aomf i;
    public boolean j;
    public int k;
    public boolean l;
    private aota n;
    private byte o = 2;
    public aony e = emptyProtobufList();
    public aony h = emptyProtobufList();

    static {
        avii aviiVar = new avii();
        a = aviiVar;
        aonm.registerDefaultInstance(avii.class, aviiVar);
    }

    private avii() {
        emptyProtobufList();
        this.i = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0001\bЛ\nဇ\u0006\u000bင\u0007\fဇ\b", new Object[]{"b", "c", "e", avif.class, "f", "g", "n", "i", "d", "h", avig.class, "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avii();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (avii.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
