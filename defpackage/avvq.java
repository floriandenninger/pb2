package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvq extends aonm implements aooz {
    public static final avvq a;
    private static volatile aopf k;
    public int b;
    public int d;
    public aqyg e;
    public aqyg f;
    public boolean g;
    public apxf h;
    public int i;
    public aomf j;
    private aota l;
    private byte m = 2;
    public aony c = emptyProtobufList();

    static {
        avvq avvqVar = new avvq();
        a = avvqVar;
        aonm.registerDefaultInstance(avvq.class, avvqVar);
    }

    private avvq() {
        emptyProtobufList();
        this.j = aomf.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0005\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0007\u0007ည\b\bᐉ\u0004\nဌ\u0005\u000bဇ\u0003", new Object[]{"b", "c", avvr.class, "d", "e", "f", "l", "j", "h", "i", avts.k, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avvq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avvq.class) {
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
