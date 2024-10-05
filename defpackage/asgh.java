package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgh extends aonm implements aooz {
    public static final asgh a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public arfs g;
    public boolean h;
    public apxf i;
    public aulq j;
    public aulq k;
    public int c = 0;
    private byte m = 2;

    static {
        asgh asghVar = new asgh();
        a = asghVar;
        aonm.registerDefaultInstance(asgh.class, asghVar);
    }

    private asgh() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ျ\u0000\u0003့\u0000\u0004ᐉ\u0004\u0005ဇ\u0005\u0007ᐉ\u0001\bᐉ\u0007\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "e", "g", "h", "f", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new asgh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (asgh.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
