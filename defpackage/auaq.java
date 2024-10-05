package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auaq extends aonm implements aooz {
    public static final auaq a;
    private static volatile aopf k;
    public int b;
    public auda c;
    public aqyg d;
    public aqyg e;
    public apxf g;
    public atdf h;
    public int i;
    private aota l;
    private byte m = 2;
    public aony f = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        auaq auaqVar = new auaq();
        a = auaqVar;
        aonm.registerDefaultInstance(auaq.class, auaqVar);
    }

    private auaq() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0006\bည\u0007\tဌ\u0005", new Object[]{"b", "c", "d", "e", "f", avfv.class, "g", "h", "l", "j", "i", atxj.l});
            case NEW_MUTABLE_INSTANCE:
                return new auaq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (auaq.class) {
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
