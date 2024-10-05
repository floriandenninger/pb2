package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aveh extends aonm implements aooz {
    public static final aveh a;
    private static volatile aopf o;
    public int b;
    public apxf d;
    public boolean f;
    public arfs g;
    public avei h;
    public avef i;
    public avee j;
    public aved k;
    public aveg m;
    private aota p;
    private byte q = 2;
    public String c = "";
    public String e = "";
    public String l = "";
    public aomf n = aomf.b;

    static {
        aveh avehVar = new aveh();
        a = avehVar;
        aonm.registerDefaultInstance(aveh.class, avehVar);
    }

    private aveh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0007\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဇ\u0003\u0004ᐉ\r\u0006ᐉ\u0005\u0007ᐉ\u000b\bᐉ\f\tဉ\t\nᐉ\u000f\u000bဈ\u0000\rᐉ\u0012\u000eည\u0013\u0010ဈ\u000e", new Object[]{"b", "d", "e", "f", "k", "g", "i", "j", "h", "m", "c", "p", "n", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aveh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aveh.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
