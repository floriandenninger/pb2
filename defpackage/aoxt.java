package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxt extends aonm implements aooz {
    public static final aoxt a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public avgg g;
    public aoxu h;
    public apxf i;
    private aqyg k;
    private apxf l;
    private apxf m;
    private byte n = 2;

    static {
        aoxt aoxtVar = new aoxt();
        a = aoxtVar;
        aonm.registerDefaultInstance(aoxt.class, aoxtVar);
    }

    private aoxt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\u000b\tᐉ\r\nᐉ\u000e\u000bᐉ\u000f\fᐉ\u0002\u0010ᐉ\t", new Object[]{"b", "c", "e", "f", "g", "l", "h", "i", "m", "d", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aoxt.class) {
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
