package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arau extends aonm implements aooz {
    public static final arau a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public boolean g;
    public apxf h;
    public apxf i;
    public String j;
    public String k;
    private byte m = 2;

    static {
        arau arauVar = new arau();
        a = arauVar;
        aonm.registerDefaultInstance(arau.class, arauVar);
    }

    private arau() {
        emptyProtobufList();
        this.j = "";
        this.k = "";
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0007ဇ\u0006\nᐉ\u0007\u000bᐉ\b\fဈ\t\rဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new arau();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arau.class) {
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
