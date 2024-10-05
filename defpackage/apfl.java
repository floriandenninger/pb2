package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfl extends aonm implements aooz {
    public static final apfl a;
    private static volatile aopf j;
    public int b;
    public apmh c;
    public aqyg d;
    public aqyg e;
    public float f;
    public int g;
    public int h;
    public int i;
    private byte k = 2;

    static {
        apfl apflVar = new apfl();
        a = apflVar;
        aonm.registerDefaultInstance(apfl.class, apflVar);
    }

    private apfl() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aouo.l});
            case NEW_MUTABLE_INSTANCE:
                return new apfl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apfl.class) {
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
