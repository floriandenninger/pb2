package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avnb extends aonm implements aooz {
    public static final avnb a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public aqyg e;
    public apmh g;
    public apmh h;
    public int i;
    private aota l;
    public int c = 0;
    private byte m = 2;
    public aony f = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        avnb avnbVar = new avnb();
        a = avnbVar;
        aonm.registerDefaultInstance(avnb.class, avnbVar);
    }

    private avnb() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ျ\u0000\u0006ᐉ\u0006\u0007ည\u0007\bဿ\u0000\tဌ\u0005", new Object[]{"d", "c", "b", "e", "f", aqyg.class, "g", "h", "l", "j", avez.a(), "i", avez.a()});
            case NEW_MUTABLE_INSTANCE:
                return new avnb();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avnb.class) {
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
