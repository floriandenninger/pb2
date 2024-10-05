package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwm extends aonm implements aooz {
    public static final atwm a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public apxf g;
    public apxf h;
    public apxf i;
    public apxf j;
    public apxf k;
    private aota m;
    public int c = 0;
    private byte n = 2;
    public aomf e = aomf.b;
    public String f = "";

    static {
        atwm atwmVar = new atwm();
        a = atwmVar;
        aonm.registerDefaultInstance(atwm.class, atwmVar);
    }

    private atwm() {
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
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ြ\u0000\u0005်\u0000\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "m", "e", "f", atwl.class, "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atwm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (atwm.class) {
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
