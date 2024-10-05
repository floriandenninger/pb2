package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avai extends aonm implements aooz {
    public static final avai a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public arfs d;
    public apxf e;
    public boolean f;
    public boolean g;
    public aott i;
    private aota k;
    private byte l = 2;
    public aomf h = aomf.b;

    static {
        avai avaiVar = new avai();
        a = avaiVar;
        aonm.registerDefaultInstance(avai.class, avaiVar);
    }

    private avai() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ည\u0006\u0007ဇ\u0003\bဇ\u0004\tဉ\u0007", new Object[]{"b", "c", "d", "e", "k", "h", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avai();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avai.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
