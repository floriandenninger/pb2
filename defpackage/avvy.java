package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvy extends aonm implements aooz {
    public static final avvy a;
    private static volatile aopf t;
    public int b;
    public Object d;
    public aoya f;
    public int g;
    public aoyi h;
    public apxf i;
    public aoyd j;
    public avvw l;
    public aoyj o;
    public aowz p;
    public boolean q;
    public boolean r;
    public int s;
    private aqyg u;
    private aulq v;
    private aota w;
    public int c = 0;
    private byte x = 2;
    public aomf e = aomf.b;
    public aony k = emptyProtobufList();
    public String m = "";
    public aony n = emptyProtobufList();

    static {
        avvy avvyVar = new avvy();
        a = avvyVar;
        aonm.registerDefaultInstance(avvy.class, avvyVar);
    }

    private avvy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0001\u0001\u0001\u001b\u0014\u0000\u0002\b\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\bᐉ\u0006\tဉ\b\nЛ\fᐉ\u0007\rᐉ\n\u000eဈ\f\u000fЛ\u0010ᐉ\r\u0011ᐉ\u000b\u0013ဉ\u000f\u0014်\u0000\u0015ᐉ\u0012\u0017်\u0000\u0018ဇ\u0014\u0019ဇ\u0015\u001bင\u0017", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", askp.class, "u", "l", "m", "n", aozf.class, "o", "v", "p", "w", "q", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new avvy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (avvy.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
