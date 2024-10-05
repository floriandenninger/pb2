package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpz extends aonm implements aooz {
    public static final aqpz a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aqyg e;
    private aqyg f;
    private atdf g;
    private aqyg h;
    private aqyg i;
    private apxf j;
    private arel k;
    private aota l;
    private byte m = 2;

    static {
        aqpz aqpzVar = new aqpz();
        a = aqpzVar;
        aonm.registerDefaultInstance(aqpz.class, aqpzVar);
    }

    private aqpz() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0005\u0012\t\u0000\u0000\t\u0005ᐉ\u0013\bᐉ\u000e\tᐉ\u000f\nᐉ\u0010\u000bᐉ\u0012\u000fᐉ\u0007\u0010ᐉ\u0011\u0011ᐉ\t\u0012ᐉ\u0002", new Object[]{"c", "l", "g", "h", "i", "k", "e", "j", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqpz.class) {
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
