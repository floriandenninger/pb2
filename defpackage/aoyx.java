package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyx extends aonm implements aooz {
    public static final aoyx a;
    private static volatile aopf j;
    public int b;
    public float d;
    public aulq e;
    public int f;
    public boolean g;
    public aoyy h;
    public aowz i;
    private aota k;
    private byte l = 2;
    public aony c = emptyProtobufList();

    static {
        aoyx aoyxVar = new aoyx();
        a = aoyxVar;
        aonm.registerDefaultInstance(aoyx.class, aoyxVar);
    }

    private aoyx() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ခ\u0002\u0005ᐉ\u0003\u0006ဌ\u0004\u0007ဇ\u0005\bᐉ\u0006\tဉ\u0007", new Object[]{"b", "c", aoyz.class, "k", "d", "e", "f", aouo.o, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyx();
            case NEW_BUILDER:
                return new aone((char[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aoyx.class) {
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
