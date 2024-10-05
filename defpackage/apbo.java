package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbo extends aonm implements aooz {
    public static final apbo a;
    private static volatile aopf k;
    public int b;
    public int c;
    public avgg d;
    public boolean e;
    public aqyg f;
    public aulq g;
    public aulq h;
    public apxf i;
    private apxf l;
    private aota m;
    private byte n = 2;
    public aomf j = aomf.b;

    static {
        apbo apboVar = new apbo();
        a = apboVar;
        aonm.registerDefaultInstance(apbo.class, apboVar);
    }

    private apbo() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0007\u0001ဋ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tည\t\nᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "l", "m", "j", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apbo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (apbo.class) {
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
