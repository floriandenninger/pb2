package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class augh extends aonm implements aooz {
    public static final augh a;
    private static volatile aopf q;
    public int b;
    public aqyg c;
    public avgg d;
    public aulq e;
    public float f;
    public int g;
    public int h;
    public aulq i;
    public apxf j;
    public apxf l;
    public aulq m;
    public long n;
    public apln o;
    public aqyg p;
    private byte r = 2;
    public aony k = emptyProtobufList();

    static {
        augh aughVar = new augh();
        a = aughVar;
        aonm.registerDefaultInstance(augh.class, aughVar);
    }

    private augh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\t\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ခ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bᐉ\u0007\tᐉ\b\nЛ\u000bᐉ\t\fᐉ\n\rဂ\u000b\u000eဉ\f\u000fᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", apxf.class, "l", "m", "n", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new augh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (augh.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
