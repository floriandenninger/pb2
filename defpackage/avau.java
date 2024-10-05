package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avau extends aonm implements aooz {
    public static final avau a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public Object e;
    public int g;
    public boolean h;
    public boolean i;
    public int d = 0;
    private byte k = 2;
    public String f = "";

    static {
        avau avauVar = new avau();
        a = avauVar;
        aonm.registerDefaultInstance(avau.class, avauVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, avauVar, avauVar, null, 256, aoqn.MESSAGE, avau.class);
    }

    private avau() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003ᐼ\u0000\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"e", "d", "c", "f", aqss.class, "g", avav.a(), "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avau();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avau.class) {
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
