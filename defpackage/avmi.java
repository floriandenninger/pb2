package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmi extends aonm implements aooz {
    public static final avmi a;
    private static volatile aopf k;
    public int b;
    public arfs d;
    public apxf e;
    public aqyg f;
    public long g;
    public avgg h;
    public aqyg i;
    public apmh j;
    private aota l;
    private byte m = 2;
    public String c = "";

    static {
        avmi avmiVar = new avmi();
        a = avmiVar;
        aonm.registerDefaultInstance(avmi.class, avmiVar);
    }

    private avmi() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avmi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avmi.class) {
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
