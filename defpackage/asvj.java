package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asvj extends aonm implements aooz {
    public static final asvj a;
    private static volatile aopf j;
    public int b;
    public int c;
    public aqyg e;
    public aqyg f;
    public awnw g;
    public awnw h;
    public awnw i;
    private byte k = 2;
    public aony d = emptyProtobufList();

    static {
        asvj asvjVar = new asvj();
        a = asvjVar;
        aonm.registerDefaultInstance(asvj.class, asvjVar);
    }

    private asvj() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ဌ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", assi.r, "d", asvh.class, "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asvj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asvj.class) {
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
