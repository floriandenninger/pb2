package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoml implements aopl {
    private final aomk a;
    private int b;
    private int c;
    private int d = 0;

    private aoml(aomk aomkVar) {
        aonz.i(aomkVar, "input");
        this.a = aomkVar;
        aomkVar.d = this;
    }

    private final Object P(aoqn aoqnVar, Class cls, aomw aomwVar) {
        aoqn aoqnVar2 = aoqn.DOUBLE;
        switch (aoqnVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(l());
            case UINT64:
                return Long.valueOf(o());
            case INT32:
                return Integer.valueOf(g());
            case FIXED64:
                return Long.valueOf(k());
            case FIXED32:
                return Integer.valueOf(f());
            case BOOL:
                return Boolean.valueOf(T());
            case STRING:
                return x();
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return t(cls, aomwVar);
            case BYTES:
                return q();
            case UINT32:
                return Integer.valueOf(j());
            case ENUM:
                return Integer.valueOf(e());
            case SFIXED32:
                return Integer.valueOf(h());
            case SFIXED64:
                return Long.valueOf(m());
            case SINT32:
                return Integer.valueOf(i());
            case SINT64:
                return Long.valueOf(n());
        }
    }

    private final Object V(aopq aopqVar, aomw aomwVar) {
        int i = this.c;
        this.c = aoqp.c(aoqp.a(this.b), 4);
        try {
            Object e = aopqVar.e();
            aopqVar.h(e, this, aomwVar);
            aopqVar.f(e);
            if (this.b == this.c) {
                return e;
            }
            throw aoob.g();
        } finally {
            this.c = i;
        }
    }

    private final Object W(aopq aopqVar, aomw aomwVar) {
        int o = this.a.o();
        aomk aomkVar = this.a;
        if (aomkVar.a >= aomkVar.b) {
            throw aoob.h();
        }
        int f = aomkVar.f(o);
        Object e = aopqVar.e();
        this.a.a++;
        aopqVar.h(e, this, aomwVar);
        aopqVar.f(e);
        this.a.B(0);
        r5.a--;
        this.a.C(f);
        return e;
    }

    private final void X(int i) {
        if (this.a.e() != i) {
            throw aoob.j();
        }
    }

    private final void Y(int i) {
        if (aoqp.b(this.b) != i) {
            throw aoob.a();
        }
    }

    private static final void Z(int i) {
        if ((i & 3) != 0) {
            throw aoob.g();
        }
    }

    private static final void aa(int i) {
        if ((i & 7) != 0) {
            throw aoob.g();
        }
    }

    public static aoml p(aomk aomkVar) {
        aoml aomlVar = aomkVar.d;
        return aomlVar != null ? aomlVar : new aoml(aomkVar);
    }

    @Override // defpackage.aopl
    public final void A(List list) {
        int n;
        int n2;
        if (list instanceof aomr) {
            aomr aomrVar = (aomr) list;
            int b = aoqp.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int o = this.a.o();
                    aa(o);
                    int e = this.a.e() + o;
                    do {
                        aomrVar.f(this.a.b());
                    } while (this.a.e() < e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aomrVar.f(this.a.b());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int o2 = this.a.o();
                aa(o2);
                int e2 = this.a.e() + o2;
                do {
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.e() < e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Double.valueOf(this.a.b()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void B(List list) {
        int n;
        int n2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aonnVar.g(this.a.g());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(this.a.g());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Integer.valueOf(this.a.g()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(this.a.g()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void C(List list) {
        int n;
        int n2;
        if (!(list instanceof aonn)) {
            int b = aoqp.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.e() < e);
                return;
            }
            if (b != 5) {
                throw aoob.a();
            }
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.E()) {
                    return;
                } else {
                    n = this.a.n();
                }
            } while (n == this.b);
            this.d = n;
            return;
        }
        aonn aonnVar = (aonn) list;
        int b2 = aoqp.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aonnVar.g(this.a.h());
            } while (this.a.e() < e2);
            return;
        }
        if (b2 != 5) {
            throw aoob.a();
        }
        do {
            aonnVar.g(this.a.h());
            if (this.a.E()) {
                return;
            } else {
                n2 = this.a.n();
            }
        } while (n2 == this.b);
        this.d = n2;
    }

    @Override // defpackage.aopl
    public final void D(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int o = this.a.o();
                    aa(o);
                    int e = this.a.e() + o;
                    do {
                        aoonVar.f(this.a.p());
                    } while (this.a.e() < e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(this.a.p());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int o2 = this.a.o();
                aa(o2);
                int e2 = this.a.e() + o2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.e() < e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(this.a.p()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void E(List list) {
        int n;
        int n2;
        if (!(list instanceof aonc)) {
            int b = aoqp.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.e() < e);
                return;
            }
            if (b != 5) {
                throw aoob.a();
            }
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.E()) {
                    return;
                } else {
                    n = this.a.n();
                }
            } while (n == this.b);
            this.d = n;
            return;
        }
        aonc aoncVar = (aonc) list;
        int b2 = aoqp.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aoncVar.h(this.a.c());
            } while (this.a.e() < e2);
            return;
        }
        if (b2 != 5) {
            throw aoob.a();
        }
        do {
            aoncVar.h(this.a.c());
            if (this.a.E()) {
                return;
            } else {
                n2 = this.a.n();
            }
        } while (n2 == this.b);
        this.d = n2;
    }

    @Override // defpackage.aopl
    public final void F(List list, aopq aopqVar, aomw aomwVar) {
        int n;
        if (aoqp.b(this.b) != 3) {
            throw aoob.a();
        }
        int i = this.b;
        do {
            list.add(V(aopqVar, aomwVar));
            if (this.a.E() || this.d != 0) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == i);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void G(List list) {
        int n;
        int n2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aonnVar.g(this.a.i());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(this.a.i());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Integer.valueOf(this.a.i()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(this.a.i()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void H(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aoonVar.f(this.a.q());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(this.a.q());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Long.valueOf(this.a.q()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(this.a.q()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    @Override // defpackage.aopl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.util.Map r8, defpackage.aoor r9, defpackage.aomw r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            aomk r1 = r7.a
            int r1 = r1.o()
            aomk r2 = r7.a
            int r1 = r2.f(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.c()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            aomk r5 = r7.a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.E()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.U()     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            aoob r4 = new aoob     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
        L3a:
            aoqn r4 = r9.c     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            java.lang.Object r5 = r9.d     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            aoqn r4 = r9.a     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: defpackage.aooa -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.U()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            aoob r8 = new aoob     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            aomk r8 = r7.a
            r8.C(r1)
            return
        L65:
            r8 = move-exception
            aomk r9 = r7.a
            r9.C(r1)
            goto L6d
        L6c:
            throw r8
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoml.I(java.util.Map, aoor, aomw):void");
    }

    @Override // defpackage.aopl
    public final void J(List list, aopq aopqVar, aomw aomwVar) {
        int n;
        if (aoqp.b(this.b) != 2) {
            throw aoob.a();
        }
        int i = this.b;
        do {
            list.add(W(aopqVar, aomwVar));
            if (this.a.E() || this.d != 0) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == i);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void K(List list) {
        int n;
        int n2;
        if (!(list instanceof aonn)) {
            int b = aoqp.b(this.b);
            if (b == 2) {
                int o = this.a.o();
                Z(o);
                int e = this.a.e() + o;
                do {
                    list.add(Integer.valueOf(this.a.l()));
                } while (this.a.e() < e);
                return;
            }
            if (b != 5) {
                throw aoob.a();
            }
            do {
                list.add(Integer.valueOf(this.a.l()));
                if (this.a.E()) {
                    return;
                } else {
                    n = this.a.n();
                }
            } while (n == this.b);
            this.d = n;
            return;
        }
        aonn aonnVar = (aonn) list;
        int b2 = aoqp.b(this.b);
        if (b2 == 2) {
            int o2 = this.a.o();
            Z(o2);
            int e2 = this.a.e() + o2;
            do {
                aonnVar.g(this.a.l());
            } while (this.a.e() < e2);
            return;
        }
        if (b2 != 5) {
            throw aoob.a();
        }
        do {
            aonnVar.g(this.a.l());
            if (this.a.E()) {
                return;
            } else {
                n2 = this.a.n();
            }
        } while (n2 == this.b);
        this.d = n2;
    }

    @Override // defpackage.aopl
    public final void L(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int o = this.a.o();
                    aa(o);
                    int e = this.a.e() + o;
                    do {
                        aoonVar.f(this.a.u());
                    } while (this.a.e() < e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(this.a.u());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int o2 = this.a.o();
                aa(o2);
                int e2 = this.a.e() + o2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.e() < e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(this.a.u()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void M(List list) {
        int n;
        int n2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aonnVar.g(this.a.m());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(this.a.m());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(this.a.m()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void N(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aoonVar.f(this.a.v());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(this.a.v());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(this.a.v()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void O(List list) {
        w(list, false);
    }

    @Override // defpackage.aopl
    public final void Q(List list) {
        w(list, true);
    }

    @Override // defpackage.aopl
    public final void R(List list) {
        int n;
        int n2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aonnVar.g(this.a.o());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(this.a.o());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(this.a.o()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void S(List list) {
        int n;
        int n2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aoonVar.f(this.a.w());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(this.a.w());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(this.a.w()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final boolean T() {
        Y(0);
        return this.a.F();
    }

    @Override // defpackage.aopl
    public final boolean U() {
        int i;
        if (this.a.E() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.G(i);
    }

    @Override // defpackage.aopl
    public final double a() {
        Y(1);
        return this.a.b();
    }

    @Override // defpackage.aopl
    public final float b() {
        Y(5);
        return this.a.c();
    }

    @Override // defpackage.aopl
    public final int c() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.n();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return aoqp.a(i);
    }

    @Override // defpackage.aopl
    public final int d() {
        return this.b;
    }

    @Override // defpackage.aopl
    public final int e() {
        Y(0);
        return this.a.g();
    }

    @Override // defpackage.aopl
    public final int f() {
        Y(5);
        return this.a.h();
    }

    @Override // defpackage.aopl
    public final int g() {
        Y(0);
        return this.a.i();
    }

    @Override // defpackage.aopl
    public final int h() {
        Y(5);
        return this.a.l();
    }

    @Override // defpackage.aopl
    public final int i() {
        Y(0);
        return this.a.m();
    }

    @Override // defpackage.aopl
    public final int j() {
        Y(0);
        return this.a.o();
    }

    @Override // defpackage.aopl
    public final long k() {
        Y(1);
        return this.a.p();
    }

    @Override // defpackage.aopl
    public final long l() {
        Y(0);
        return this.a.q();
    }

    @Override // defpackage.aopl
    public final long m() {
        Y(1);
        return this.a.u();
    }

    @Override // defpackage.aopl
    public final long n() {
        Y(0);
        return this.a.v();
    }

    @Override // defpackage.aopl
    public final long o() {
        Y(0);
        return this.a.w();
    }

    @Override // defpackage.aopl
    public final aomf q() {
        Y(2);
        return this.a.x();
    }

    @Override // defpackage.aopl
    public final Object r(Class cls, aomw aomwVar) {
        Y(3);
        return V(aopi.a.a(cls), aomwVar);
    }

    @Override // defpackage.aopl
    public final Object s(aopq aopqVar, aomw aomwVar) {
        Y(3);
        return V(aopqVar, aomwVar);
    }

    @Override // defpackage.aopl
    public final Object t(Class cls, aomw aomwVar) {
        Y(2);
        return W(aopi.a.a(cls), aomwVar);
    }

    @Override // defpackage.aopl
    public final Object u(aopq aopqVar, aomw aomwVar) {
        Y(2);
        return W(aopqVar, aomwVar);
    }

    @Override // defpackage.aopl
    public final String v() {
        Y(2);
        return this.a.z();
    }

    public final void w(List list, boolean z) {
        int n;
        int n2;
        if (aoqp.b(this.b) != 2) {
            throw aoob.a();
        }
        if (!(list instanceof aooj) || z) {
            do {
                list.add(z ? x() : v());
                if (this.a.E()) {
                    return;
                } else {
                    n = this.a.n();
                }
            } while (n == this.b);
            this.d = n;
            return;
        }
        aooj aoojVar = (aooj) list;
        do {
            aoojVar.i(q());
            if (this.a.E()) {
                return;
            } else {
                n2 = this.a.n();
            }
        } while (n2 == this.b);
        this.d = n2;
    }

    @Override // defpackage.aopl
    public final String x() {
        Y(2);
        return this.a.A();
    }

    @Override // defpackage.aopl
    public final void y(List list) {
        int n;
        int n2;
        if (list instanceof aolw) {
            aolw aolwVar = (aolw) list;
            int b = aoqp.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int e = this.a.e() + this.a.o();
                    do {
                        aolwVar.f(this.a.F());
                    } while (this.a.e() < e);
                    X(e);
                    return;
                }
                throw aoob.a();
            }
            do {
                aolwVar.f(this.a.F());
                if (this.a.E()) {
                    return;
                } else {
                    n2 = this.a.n();
                }
            } while (n2 == this.b);
            this.d = n2;
            return;
        }
        int b2 = aoqp.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int e2 = this.a.e() + this.a.o();
                do {
                    list.add(Boolean.valueOf(this.a.F()));
                } while (this.a.e() < e2);
                X(e2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Boolean.valueOf(this.a.F()));
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }

    @Override // defpackage.aopl
    public final void z(List list) {
        int n;
        if (aoqp.b(this.b) != 2) {
            throw aoob.a();
        }
        do {
            list.add(q());
            if (this.a.E()) {
                return;
            } else {
                n = this.a.n();
            }
        } while (n == this.b);
        this.d = n;
    }
}
